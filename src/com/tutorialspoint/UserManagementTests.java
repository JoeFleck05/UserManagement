package com.tutorialspoint;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import org.junit.Test;

public class UserManagementTests {
	
	private final int EMPTY_USER_ID = 0;
	private final String SUCCESS_USERS = "";
	private final int GET_USER_ID = 2; 
	private final String SUCCESS_NAME = "Mahesh";
	private final int SUCCESS_ID = 2;
	private final String SUCCESS_PROFESSION = "Teacher";
	private final int DELETE_USER = 1;
	private final String EXPECTED_RESPONSE = "<result>success</result>";
	private final String UPDATE_USER = "1";
	private final String USER_NAME = "Mesh";
	private final String PROFESSION = "Educator";
	private final String AVAILABLE_OPTIONS = "<operations>GET, PUT, POST, DELETE</operations>";
	
	private final String FIRST_NAME = "Genish";
	private final String PROFESSION_TWO = "Assistant Principal";
	private final String USER_STATUS = "ACTIVE";
	
	@Context private HttpServletResponse response;
	
	UserService tester = new UserService();

	@Test
	public void testGetUserId() throws SQLException{ assertEquals(SUCCESS_NAME, tester.getUser(GET_USER_ID).getName()); }
	@Test
	public void testGetUsersName() throws SQLException{ assertEquals(SUCCESS_NAME, tester.getUser(GET_USER_ID).getName()); }
	@Test
	public void testGetUsersProfession() throws SQLException{ assertEquals(SUCCESS_PROFESSION, tester.getUser(GET_USER_ID).getProfession()); }
	@Test
	public void testUpdateUser() throws NumberFormatException, IOException, SQLException{ assertEquals(EXPECTED_RESPONSE, tester.updateUser(Integer.parseInt(UPDATE_USER), PROFESSION, response)); }
	@Test
	public void testAvailableOptions() { assertEquals(AVAILABLE_OPTIONS, tester.getSupportedOperations()); }
	@Test
	public void testInsertUser() throws IOException, SQLException { assertEquals(EXPECTED_RESPONSE, tester.createUser(FIRST_NAME, PROFESSION_TWO, USER_STATUS, response));}
	@Test
	public void testDeleteUser() throws SQLException{ assertEquals(EXPECTED_RESPONSE, tester.deleteUser(DELETE_USER)); }
	

}
