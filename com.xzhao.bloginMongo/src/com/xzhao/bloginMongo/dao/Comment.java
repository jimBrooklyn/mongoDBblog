package com.xzhao.bloginMongo.dao;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("comment")
public class Comment {
	private String message;	
	//name of user sending message
	private String name;

	//send message to this Post
	private Post origPost;	
	private Date date;	
		
	public Comment(){			
	}
	

	public Comment(String message, String name, Post origPost, Date date) {

		this.message = message;
		this.name = name;
		this.origPost = origPost;
		this.date = date;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Post getOrigPost() {
		return origPost;
	}

	public void setOrigPost(Post origPost) {
		this.origPost = origPost;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Comment [message=" + message + ", name=" + name + ",  date=" + date + "]";
	}		
}
