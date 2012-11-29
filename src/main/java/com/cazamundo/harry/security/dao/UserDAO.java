package com.cazamundo.harry.security.dao;

import com.cazamundo.harry.security.dao.model.DbUser;

public interface UserDAO {
	
	DbUser searchDatabase(String username);

}
