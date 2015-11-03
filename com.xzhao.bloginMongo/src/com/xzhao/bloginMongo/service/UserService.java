package com.xzhao.bloginMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzhao.bloginMongo.dao.User;
import com.xzhao.bloginMongo.dao.UserDao;

@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void createUser(User user) {
		// TODO Auto-generated method stub
		userDao.createUser(user);
	}

	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return userDao.allUsers();
	}

	public boolean exists(String username) {
		// TODO Auto-generated method stub
		return userDao.exists(username);
	}
		
	
}
