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
	
	public User getUser(int userId) throws SQLException {
		User userList = null;
		String sql = "Select user_id, first_name, profession, user_status from just_for_fun.users where user_id = " + userId + " AND NOT 'DELETED'";
		userList = getUserDao(sql);
		return userList;
	}
	
	public int addUser(User pUser) throws SQLException{
		String sql = "insert into users (first_name,profession,user_status) values('"+ pUser.getName() +"','" + pUser.getProfession() + "','" + pUser.getUserStatus() +"');";
		runQuery(sql);
		return 1;
	}

   public int updateUserProfession(String newProfession, int userid) throws SQLException {
	   int userUpdated = 0;
	   if(!getUser(userid).getName().isEmpty()) {
		   String sql = "Update just_for_fun.users SET profession = '"+ newProfession +"' WHERE user_id = " + userid;
		   userUpdated = runQuery(sql);
		   return 1;
	   } else {
		   return 0;
	   }
   }
   
   public int updateUser(int userId) throws SQLException{
	   
	return 0;
   }
   
   public int deleteUser(int userId) throws SQLException{
	   if(!getUser(userId).getName().isEmpty()) {
		   String sql = "Update just_for_fun.users SET user_status = 'DELETED', modified_on = CURRENT_TIMESTAMP where user_id = " + userId;
		   runQuery(sql);
		   return 1;
	   }
	   return 0;
   }
   
   private static User getUserDao(String sql) throws SQLException {
		User userList = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/just_for_fun","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				userList = new User(rs.getString(1),rs.getString(2),rs.getString(3));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
	
	private static int runQuery(String sql) throws SQLException {
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
