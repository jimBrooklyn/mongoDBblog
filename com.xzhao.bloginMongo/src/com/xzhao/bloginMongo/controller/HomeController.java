package com.xzhao.bloginMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xzhao.bloginMongo.dao.User;
import com.xzhao.bloginMongo.dao.UserDao;
import com.xzhao.bloginMongo.service.UserService;

@Controller
public class HomeController {
	@Autowired 
	private UserService userService;
	
	@RequestMapping("/")
	public String showHome(Model model)	{	
		
		List<User> users= userService.allUsers();
		
		model.addAttribute("users", users);
		
		System.out.println(users.size());
		System.out.println(users.get(0).getEmail());
		return "home";
	}

}
