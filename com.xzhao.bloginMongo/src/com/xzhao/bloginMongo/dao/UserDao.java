package com.xzhao.bloginMongo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {
	@Autowired 
	private MongoTemplate mongotemplate;
}
