package com.xzhao.bloginMongo.dao;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("comment")
public class Comment {
	private String message;	
	//name of user sending message
	private String name;

	//send message to this Post
	private String postId;	
	private Date date;	
		
	public Comment(){			
	}

	public Comment(String message, String name, String postId, Date date) {
		super();
		this.message = message;
		this.name = name;
		this.postId = postId;
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

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Comment [message=" + message + ", name=" + name + ", postId=" + postId + ", date=" + date + "]";
	}
}
