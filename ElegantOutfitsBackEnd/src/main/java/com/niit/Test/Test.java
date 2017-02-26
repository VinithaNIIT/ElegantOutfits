package com.niit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.dao.CategoryDAOImpl;
import com.niit.model.Category;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.scan("com.niit.model");
		ac.scan("com.niit.dao");
		ac.refresh();
		CategoryDAO categoryDAO=(CategoryDAO)ac.getBean("categoryDAO");
	    Category category=(Category)ac.getBean("category");
	    category.setCategorydescription("desc101");
	    category.setCategoryid("101");
	    category.setCategoryname("cat");
	    System.out.println(category);

	}

}
