package com.tutorialspoint;

import java.sql.SQLException; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam; 
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;
@Path("/UserService")

public class UserService {

	UserDao userDao = new UserDao();
	int returnId;
	private static final String SUCCESS_RESULT = "<result>success</result>"; 
	private static final String FAILURE_RESULT = "<result>failure</result>";
	
	@GET
	@Path("/users/{userid}")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser(@PathParam("userid")int userid) throws SQLException {
		return UserDao.getUser(userid);
	}
}
