package com.xzhao.bloginMongo.dao;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {
	@Id
	private ObjectId id;
	private String username;
	
	@Size(min=4, max=100)
	private String title;
	
	@Size(min=20)
	private String content;
	
	private Date date;
	private List<Comment> comments;
	
	public Post() {

	}

	public Post(ObjectId id, String username, String title, String content, Date date, List<Comment> comments) {
		super();
		this.id = id;
		this.username = username;
		this.title = title;
		this.content = content;
		this.date = date;
		this.comments = comments;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", username=" + username + ", title=" + title + ", content=" + content + ", date="
				+ date + ", comments=" + comments + "]";
	}

}
