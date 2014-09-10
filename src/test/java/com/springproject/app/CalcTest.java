package com.springproject.app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springproject.app.entities.Post;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:**/META-INF/applicationContext.xml"}) 
public class CalcTest {

	  
	   
	
	@Test
	public void test() {
		
	
 
		Post post = new Post();
		post.setTitle("marcio");
		
		 
		 
		 
		Assert.assertEquals("marcio", post.getTitle());
		
		System.out.println(post.getTitle());
		
		
		
		  
		 
		
	}

}
