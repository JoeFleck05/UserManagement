package com.tutorialspoint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class UserDao {
	
	public List<User> getAllUsers() {
		List<User> userList = null;
		try {
			File file = new File("User.dat");
			if(!file.exists()) {
				User user = new User(1,"Mahesh","Teacher");
				User userTwo = new User(2,"Joe","Principal");
				User userThree = new User(3,"Nancy","Computer Teacher");
				User userFour = new User(4,"Julia","Student");
				User userFive = new User(5,"Jared","Student");
				User userSix = new User(6,"Nathan","Student");
				userList = new ArrayList<User>();
				userList.add(user);
				userList.add(userTwo);
				userList.add(userThree);
				userList.add(userFour);
				userList.add(userFive);
				userList.add(userSix);
				saveUserList(userList);
			} else {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				userList = (List<User>) ois.readObject();
				ois.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	public User getUser(int userId) throws SQLException {
		User userList = null;
		String sql = "Select * from just_for_fun.users where user_id = " + userId;
		userList = getUserDao(sql);
		return userList;
	}
	
//	public User getUser(int id){ 
//      List<User> users = getAllUsers();
//      for(User user: users){ 
//         if(user.getId() == id){ 
//            return user; 
//         } 
//      }
//      return null; 
//   }  
   public int addUser(User pUser){ 
      List<User> userList = getAllUsers(); 
      boolean userExists = false; 
      for(User user: userList){ 
         if(user.getId() == pUser.getId()){ 
            userExists = true; 
            break; 
         } 
      }   
      if(!userExists){ 
         userList.add(pUser); 
         saveUserList(userList); 
         return 1; 
      } 
      return 0; 
   }
   public int updateUserProfession(String newProfession, int userid) throws SQLException {
	   int userUpdated = 0;
	   if(userid == getUser(userid).getId()) {
		   String sql = "Update just_for_fun.users SET profession = '"+ newProfession +"' WHERE user_id = " + userid;
		   userUpdated = updateUser(sql);
		   return 1;
	   } else {
		   return 0;
	   }
   }
//   public int updateUser(User pUser){
//      List<User> userList = getAllUsers();  
//      for(User user: userList){ 
//         if(user.getId() == pUser.getId()){ 
//            int index = userList.indexOf(user);    
//            userList.set(index, pUser); 
//            saveUserList(userList); 
//            return 1; 
//         } 
//      }
//      return 0;
//   }
   public int updateUser(int userId) throws SQLException{
	   
	return 0;
   }
   
   public int deleteUser(int userId) throws SQLException{
	   if(userId == getUser(userId).getId()) {
		   String sql = "Update just_for_fun.users SET user_status = 'DELETED', modified_on = CURRENT_TIMESTAMP where user_id = " + userId;
		   updateUser(sql);
		   return 1;
	   }
	   return 0;
   }
//   public int deleteUser(int id){ 
//      List<User> userList = getAllUsers();  
//      for(User user: userList){ 
//         if(user.getId() == id){ 
//            int index = userList.indexOf(user);    
//            userList.remove(index); 
//            saveUserList(userList); 
//            return 1;    
//         } 
//      }   
//      return 0; 
//   }

	private void saveUserList(List<User> userList) {
		try {
			File file = new File("Users.dat");
			FileOutputStream fos;
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static User getUserDao(String sql) throws SQLException {
		User userList = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/just_for_fun","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				userList = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
	
	private static int updateUser(String sql) throws SQLException {
		int userList = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/just_for_fun","root","");
			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(sql);
			userList = 1;
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
}
