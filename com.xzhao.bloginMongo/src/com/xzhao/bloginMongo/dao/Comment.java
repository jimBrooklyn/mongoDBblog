package com.xzhao.bloginMongo.dao;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component("comment")
public class Comment {
	@NotBlank
	@Size(min=4)
	private String message;	
	//name of user sending message
	
	@NotBlank
	@Size(min=4)
	private String name;

	private Date date;	
	private String postId;	
	public Comment(){			
	}
	public Comment(String message, String name, Date date, String postId) {

		this.message = message;
		this.name = name;
		this.date = date;
		this.postId = postId;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	@Override
	public String toString() {
		return "Comment [message=" + message + ", name=" + name + ", date=" + date + ", postId=" + postId + "]";
	}


}
