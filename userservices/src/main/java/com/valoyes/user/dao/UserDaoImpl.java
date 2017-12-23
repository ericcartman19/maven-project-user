package com.valoyes.user.dao;

import java.util.HashMap;
import java.util.Map;

import com.valoyes.user.dto.User;

public class UserDaoImpl implements UserDao {
	
	// esto simulara el acceso a la informacion desde la base de datos
	Map<Integer, User> users = new HashMap<>();

	public void create(User user) {
		users.put(user.getId(), user);
	}

	public User findUser(int id) {
		return users.get(id);
	}

}
