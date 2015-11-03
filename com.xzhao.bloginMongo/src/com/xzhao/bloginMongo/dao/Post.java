package com.xzhao.bloginMongo.dao;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {
	@Id
	private ObjectId id;
	private String username;
	private String subject;
	private String content;
	private Date date;

	public Post() {
	}


	public Post(ObjectId id, String username, String subject, String content, Date date) {

		this.id = id;
		this.username = username;
		this.subject = subject;
		this.content = content;
		this.setDate(date);
	}


	public ObjectId getId() {
		return id;
	}


	public void setId(ObjectId id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", username=" + username + ", subject=" + subject + ", content=" + content + ", date="
				+ date + "]";
	}	
}
