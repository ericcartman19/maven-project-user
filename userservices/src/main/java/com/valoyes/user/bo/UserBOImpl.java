package com.valoyes.user.bo;

import com.valoyes.user.dao.UserDao;
import com.valoyes.user.dto.User;

public class UserBOImpl implements UserBO {

	UserDao dao;
	
	@Override
	public void create(User user) {
		dao.create(user);
	}

	@Override
	public User findUser(int id) {
		return dao.findUser(id);
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	

}
