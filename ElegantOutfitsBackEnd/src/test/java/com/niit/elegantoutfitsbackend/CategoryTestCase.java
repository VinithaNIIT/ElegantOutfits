package com.niit.elegantoutfitsbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.dao.CategoryDAOImpl;
import com.niit.model.Category;

public class CategoryTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Category category;
	@Autowired
	static CategoryDAO categoryDAO;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		 categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		 category=(Category)context.getBean("category");
		System.out.println("Objects created successfully");
	
	}
	@Test
	public void createCategoryTestCase()
	{
		category.setCategoryid("cat005");
		category.setCategoryname("asasa");
		category.setCategorydescription("this is indian wear");
		System.out.println("Create category");
		boolean status=categoryDAO.insertCategory(category);
		Assert.assertEquals("create Category Test Case", true, status);
		
	}
	
	@Test
	public void updateCategorytestCase()
	{
		category.setCategoryid("cat004");
		category.setCategoryname("Saree");
		boolean status=categoryDAO.updateCategory(category);
		Assert.assertEquals("Update Category Test Case", true, status);
	}
	@Test
	public void deleteCategoryTestCase()
	{
		category.setCategoryid("cat003");
		System.out.println("delete"+category.getCategoryid());
		Assert.assertEquals("Delete Category Test Case",true,categoryDAO.deleteCategory(category.getCategoryid()));
		
	}
	
	@Test
	public void getCategoryTestCase()
	{
		Assert.assertEquals("get Category Test Case", null, categoryDAO.getCategoryById(""));
	}
	@Test
	public void getAllCategoryTestCase()
	{
		Assert.assertEquals("Get All Category Test Case", 4, categoryDAO.getCategory().size());
	}
	

}
