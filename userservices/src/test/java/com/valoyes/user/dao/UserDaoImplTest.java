package com.valoyes.user.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import com.valoyes.user.dto.User;

public class UserDaoImplTest {

	// objeto DAO que queremos configurar
	UserDao dao = new UserDaoImpl();
	
	@Test
	public void casPassant_ShouldCreateAndRecoverAUser() {

		User user = new User();
		user.setId(1);
		user.setName("Browson");
		user.setEmail("browson@gmail.com");
		// creamos el user
		dao.create(user);
		
		// assert
		assertEquals("Browson", dao.findUser(1).getName());
		assertEquals("browson@gmail.com", dao.findUser(1).getEmail());
		assertNotSame("browson@yahoo.com", dao.findUser(1).getEmail());
	}

}
