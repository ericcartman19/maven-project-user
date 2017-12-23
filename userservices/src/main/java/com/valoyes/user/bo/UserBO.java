package com.valoyes.user.bo;

import com.valoyes.user.dto.User;

public interface UserBO {
	
	void create(User user);
	
	User findUser(int id);
	
}
