package com.xzhao.bloginMongo.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xzhao.bloginMongo.dao.Comment;
import com.xzhao.bloginMongo.dao.Post;
import com.xzhao.bloginMongo.service.PostService;

@Controller
public class PostsController {

	private PostService postService;

	@Autowired
	public void setPostService(PostService postService) {
		this.postService = postService;
	}

	@RequestMapping("/posts")
	public String showPosts(Model model, Principal principal) {
		String username = principal.getName();
		List<Post> posts = postService.allPosts(username);
		model.addAttribute("posts", posts);
		model.addAttribute("comment",new Comment()); // if I want to send multi comments in a page shloud be array
		return "posts";
	}

	@RequestMapping("/createpost")
	public String createPost(Model model, Principal principal) {

		Post post = null;
		if (principal != null) {
			post = new Post();
		}
		model.addAttribute("post", post);
		return "createpost";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/docreate")
	public String doCreate(Model model, Post post, BindingResult rs, Principal principal) {

		if (rs.hasErrors()) {
			return "createpost";

		} else {
			String username = principal.getName();
			post.setUsername(username);
			post.setId(new ObjectId());		
			post.setDate(new Date());
			postService.createPost(post);
			
			return "postcreated";
		}
	}

}
