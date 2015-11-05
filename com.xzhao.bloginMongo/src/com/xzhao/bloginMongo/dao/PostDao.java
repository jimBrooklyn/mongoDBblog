package com.xzhao.bloginMongo.dao;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component("postDao")
public class PostDao {
	@Autowired 
	private MongoTemplate mongoTemplate;
	
	private String POSTS="posts";
	
	public void createPost(Post post) {
		// TODO Auto-generated method stub
		mongoTemplate.save(post);
	}
	public List<Post> allPosts(String username) {
		Query query = new Query(Criteria.where("username").is(username));
		return mongoTemplate.find(query, Post.class, POSTS);
	}
	public void addComment(ObjectId id, Comment comment) {
		// TODO Auto-generated method stub
		comment.setDate(new Date());
		mongoTemplate.updateFirst(Query.query(Criteria.where("id").is(id)),
                new Update().push("comments",comment), Post.class);
		
	}	
}
