package com.niit.elegantoutfitsbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.model.User;

public class UserTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static User user;
	@Autowired
	static UserDAO userDAO;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		user=(User)context.getBean("user");
		userDAO=(UserDAO) context.getBean("userDAO");
		System.out.println("Objects created successfully");
	}

	@Test
	public void addUserTestCase()
	{
		user.setUsername("kiran009");
		user.setPassword("kiran009");
		user.setFirstname("kiran");
		user.setEmail("kiran98@yahoo.com");
		user.setMobile(Long.parseLong("9800656612"));
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		Assert.assertEquals("Add User Test case", true, userDAO.addUser(user));
		
		
	}
	@Test
	public void validateUserTestCase()
	{
	user.setUsername("anu");
	user.setPassword("1234");
	Assert.assertEquals("ValidateUserTestCase", true, userDAO.validate(user.getUsername(), user.getPassword()));
	}
}
