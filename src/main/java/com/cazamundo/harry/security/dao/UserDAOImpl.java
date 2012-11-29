package com.cazamundo.harry.security.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cazamundo.harry.security.dao.model.DbUser;

public class UserDAOImpl implements UserDAO {
	
	protected static Logger logger = Logger.getLogger("dao");
	
	/**
	  * Simulates retrieval of data from a database.
	  */
	@Override
	 public DbUser searchDatabase(String username) {
	  // Retrieve all users from the database
	  List<DbUser> users = internalDatabase();
	   
	  // Search user based on the parameters
	  for(DbUser dbUser:users) {
	   if ( dbUser.getUserName().equals(username)  == true ) {
	    logger.debug("User found");
	    // return matching user
	    return dbUser;
	   }
	  }
	   
	  logger.error("User does not exist!");
	  throw new RuntimeException("User does not exist!");
	 }
	
	 /**
	  * Our fake database. Here we populate an ArrayList with a dummy list of users.
	  */
	 private List<DbUser> internalDatabase() {
	  // Dummy database
	   
	  // Create a dummy array list
	  List<DbUser> users = new ArrayList<DbUser>();
	  DbUser user = null;
	   
	  // Create a new dummy user
	  user = new DbUser();
	  user.setUserName("admin");
	  // Actual password: admin
	  user.setPassword("21232f297a57a5a743894a0e4a801fc3");
	  // Admin user
	  user.setAccess(1);
	   
	  // Add to array list
	  users.add(user);
	   
	  // Create a new dummy user
	  user = new DbUser();
	  user.setUserName("user");
	  // Actual password: user
	  user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
	  // Regular user
	  user.setAccess(2);
	   
	  // Add to array list
	  users.add(user);
	   
	  return users;
	 }
	  
	}
//
//	private static List<DbUser> dbUserList = new ArrayList<DbUser>();
//
//	private static DbUser user1;
//
//	private static DbUser user2;
//
//	private static DbUser admin;
//
//	public UserDAOImpl() {
//		// set User 1
//		user1.setUserName("user1");
//		user1.setPassword("user");
//		user1.setAccess(0);
//
//		// set User 2
//		user2.setUserName("user2");
//		user2.setPassword("user");
//		user2.setAccess(0);
//
//		// set Admin
//		admin.setUserName("admin");
//		admin.setPassword("admin");
//		admin.setAccess(1);
//		
//		dbUserList.add(user1);
//		dbUserList.add(user2);
//		dbUserList.add(admin);
//	}
//
//	@Override
//	public DbUser searchDatabase(String userName) {
//
//		for (DbUser user : dbUserList) {
//			if (userName.equalsIgnoreCase(user.getUserName())) {
//				return user;
//			}
//		}
//		return null;
//	}
//}
