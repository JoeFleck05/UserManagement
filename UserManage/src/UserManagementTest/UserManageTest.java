package UserManagementTest;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.tutorialspoint.UserService;

public class UserManageTest {

	private final int GET_USER_ID = 1; 
	private final String SUCCESS_NAME = "Joe";
	
	UserService userService = new UserService();
	
	@Test
	public void testGetUserId() throws SQLException{ assertEquals(SUCCESS_NAME, userService.getUser(GET_USER_ID).getName()); }

}
