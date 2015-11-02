package com.xzhao.bloginMongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {
	@Autowired 
	private MongoTemplate mongoTemplate;
	
	private String USERS="users";
	
	public void createUser(User user) {
		// TODO Auto-generated method stub
		mongoTemplate.save(user);
	}
	public List<User> allUsers() {
		return mongoTemplate.findAll(User.class, USERS);
	}	
}
