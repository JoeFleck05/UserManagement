package com.tutorialspoint;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletResponse; 
import javax.ws.rs.Consumes; 
import javax.ws.rs.DELETE; 
import javax.ws.rs.FormParam; 
import javax.ws.rs.GET; 
import javax.ws.rs.OPTIONS; 
import javax.ws.rs.POST; 
import javax.ws.rs.PUT; 
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.Context; 
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
	public User getUser(@PathParam("userid") int userid) throws SQLException{
		return userDao.getUser(userid);
	}
	
	@PUT 
    @Path("/users") 
    @Produces(MediaType.APPLICATION_XML) 
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	public String createUser(@FormParam("name") String name,
			@FormParam("profession") String profession,
			@FormParam("user_status") String user_status,
			@Context HttpServletResponse servletResponse) throws IOException, SQLException{
		User user = new User(name, profession, user_status);
		int result = userDao.addUser(user);
		if(result == 1){
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}
    
	@POST 
    @Path("/users/{userid}")  
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String updateUser(@FormParam("id") int id, @FormParam("profession") String profession, 
		      @Context HttpServletResponse servletResponse) throws IOException, SQLException{
//		User user = new User(id, name, profession);
		int result = userDao.updateUserProfession(profession, id);
		if(result == 1){
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}
    
	@DELETE 
    @Path("/users/{userid}") 
    @Produces(MediaType.APPLICATION_XML) 
    public String deleteUser(@PathParam("userid") int userid) throws SQLException{ 
      int result = userDao.deleteUser(userid); 
      if(result == 1){ 
         return SUCCESS_RESULT; 
      } 
      return FAILURE_RESULT; 
    }  
    
	@OPTIONS 
    @Path("/users") 
    @Produces(MediaType.APPLICATION_XML) 
    public String getSupportedOperations(){ 
      return "<operations>GET, PUT, POST, DELETE</operations>"; 
    }

//	public Object updateUser(int parseInt, String pROFESSION, HttpServletResponse response) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
