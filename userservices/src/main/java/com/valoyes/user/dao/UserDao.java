package com.valoyes.user.dao;

import com.valoyes.user.dto.User;

public interface UserDao {

	void create(User user);
	
	User findUser(int id);
	
}
