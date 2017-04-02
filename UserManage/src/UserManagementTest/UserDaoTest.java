package UserManagementTest;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.tutorialspoint.User;
import com.tutorialspoint.UserDao;

public class UserDaoTest {
	
	UserDao userDao = new UserDao();
	User userD = null;
	List<User> userList = null;
	User user = new User(1,"Joe","Software Engineer");
	private final int EXPECTED_USER_ID = 1;
	private final String EXPECTED_USER_NAME = "Joe";
	private final String EXPECTED_USER_PROFESSION = "Software Engineer";
	private int ACTUAL_USER_ID = 0;
	private String ACTUAL_USER_NAME = "Joe";
	private String ACTUAL_USER_PROFESSION = "Software Engineer";
	

	@Test
	public void testGetOneUser() throws SQLException {
		userD = UserDao.getUser(EXPECTED_USER_ID);
		ACTUAL_USER_ID = userD.getId();
		assertEquals(ACTUAL_USER_ID, EXPECTED_USER_ID);
		ACTUAL_USER_NAME = userD.getName();
		assertEquals(ACTUAL_USER_NAME, EXPECTED_USER_NAME);
		ACTUAL_USER_PROFESSION = userD.getProfession();
		assertEquals(ACTUAL_USER_PROFESSION, EXPECTED_USER_PROFESSION);
	}

}
