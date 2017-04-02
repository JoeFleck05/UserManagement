package com.tutorialspoint;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
//	public static void main(String[] args) throws SQLException{
////		getAllUsers();
////		getUser(2);
//	}
	
//	public static List<User> getAllUsers() throws SQLException {
//		List<User> userList = null;
//		String sql = "select * from just_for_fun.users";
//		userList = getUserDao(sql);
//		return userList;
//	}
	
	public static User getUser(int user_id) throws SQLException {
		User userList = null;
		String sql = "Select * from just_for_fun.users where user_id = " + user_id;
		userList = getUserDao(sql);
		return userList;
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
}
