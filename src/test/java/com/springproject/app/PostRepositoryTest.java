package com.springproject.app;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springproject.app.entities.Post;
import com.springproject.app.repositories.PostRepository;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:applicationContext.xml"}) 
//@ContextConfiguration(locations={"classpath:testContext.xml"})
@ContextConfiguration(locations={"classpath:applicationContext.xml"})

@Qualifier
public class PostRepositoryTest {
	
	
	@Autowired
	PostRepository repository;
	
	@Test
	public void test() {
		Post post = new Post();
		post.setPostDate(new Date());
		post.setTitle("Terceiro Post");
		post.setImagem("imagem/foto1.png");
		
		repository.save(post);
		
		Post dbpost = repository.findOne(post.getPostId());
		
		post.setTitle("Post de numero: " + post.getPostId());
		repository.save(post);
		Assert.assertNotNull(dbpost);
		
		dbpost.mostra();
		
		
	}

}
