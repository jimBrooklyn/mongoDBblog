package com.xzhao.bloginMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzhao.bloginMongo.dao.Post;
import com.xzhao.bloginMongo.dao.PostDao;

@Service("postService")
public class PostService {
	@Autowired
	private PostDao postDao;
	
	public void createPost(Post post) {
		// TODO Auto-generated method stub
		postDao.createPost(post);
	}

	public List<Post> allPosts(String username) {
		// TODO Auto-generated method stub
		return postDao.allPosts(username);
	}
		
	public boolean hasPost(String username) {
		if(username==null)		return false;
		List<Post> accounts = postDao.allPosts(username);
		if(accounts.size()>0) return true;
		return false;
	}

}