package com.tutorialspoint;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserManagementTests {
	
	private final int EMPTY_USER_ID = 0;
	private final String SUCCESS_USERS = "";
	private final int GET_USER_ID = 2; 
	private final String SUCCESS_NAME = "Joe";
	private final int SUCCESS_ID = 2;
	private final String SUCCESS_PROFESSION = "Principal";
	
	
	UserService tester = new UserService();

	@Test
	public void testGetUserId(){ assertEquals(SUCCESS_ID, tester.getUser(GET_USER_ID).getId()); }
	@Test
	public void testGetUsersName(){ assertEquals(SUCCESS_NAME, tester.getUser(GET_USER_ID).getName()); }
	@Test
	public void testGetUsersProfession(){ assertEquals(SUCCESS_PROFESSION, tester.getUser(GET_USER_ID).getProfession()); }
	@Test
	public void testGetUsersReturnEmpty(){ assertNotEquals(SUCCESS_USERS, tester.getUser(EMPTY_USER_ID).getId()); }

}
