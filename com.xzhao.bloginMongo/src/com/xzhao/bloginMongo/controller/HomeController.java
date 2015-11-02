package com.xzhao.bloginMongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired 
	private MongoTemplate mongotemplate;
	
	
	@RequestMapping("/")
	public String showHome()	{				

		return "home";
	}

}
