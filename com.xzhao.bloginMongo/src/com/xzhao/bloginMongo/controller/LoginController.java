package com.xzhao.bloginMongo.controller;

import java.security.Principal;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xzhao.bloginMongo.dao.Comment;
import com.xzhao.bloginMongo.dao.Post;
import com.xzhao.bloginMongo.dao.User;
import com.xzhao.bloginMongo.service.PostService;
import com.xzhao.bloginMongo.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private PostService postService;

	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("/loggedout")
	public String showLogout() {
		return "loggedout";
	}
	
	@RequestMapping("/denied")
	public String showDenied() {
		return "denied";
	}
	
	@RequestMapping("/deposited")
	public String showDeposited() {
		return "deposited";
	}
	@RequestMapping("/withdrawn")
	public String showWithDrawn() {
		return "withdrawn";
	}	
	
	@RequestMapping("/newcomment")
	public String createComment(Model model) {
		model.addAttribute("comment",new Comment());
		return "newcomment";
	}
	
	@RequestMapping("/allposts")

		public String showAllposts(Model model, Principal principal)	{				
			List<Post> posts = postService.allPosts(principal.getName());
			model.addAttribute("posts", posts);	

			boolean hasPost = false;
			if(principal !=null){
				hasPost = postService.hasPost(principal.getName());
			}		
			model.addAttribute("hasPost", hasPost);
		return "allposts";
	}

	@RequestMapping("/newuser")
	public String showNewUser(Model model) {
		model.addAttribute("user", new User());
		return "newuser";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/createuser")
	public String doCreate(Model model, @Validated User user, BindingResult rs) {

		if (rs.hasErrors()) {
			return "newuser";
		}
		if (userService.exists(user.getUsername())) {
			rs.rejectValue("username", "DuplicateKey.user.username");
			return "newuser";
		}
		user.setId(new ObjectId());
		userService.createUser(user);
		return "usercreated";
	}


@RequestMapping(method = RequestMethod.POST, value = "/sendcomment")
public String dosend(Model model, @Validated Comment comment, BindingResult rs) {

	if (rs.hasErrors()) {
		return "newcomment";
	}
	if (true) {
	}
	
	ObjectId id = null;
	postService.addComment(id,comment);
	return "commentsend";
}
}
