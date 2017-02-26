package com.niit.elegantoutfitsbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.dao.ProductDAO;
import com.niit.model.Product;
import com.niit.model.Product;

public class ProductTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Product product;
	@Autowired
	static ProductDAO productDAO;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		productDAO=(ProductDAO)context.getBean("productDAO");
		product=(Product)context.getBean("product");
		System.out.println("Objects created successfully");
	
	}
	@Test
		public void createProductTestCase()
		{
			product.setProductid("p003");
			product.setProductname("Pyjama");
			product.setProductdescription("this is sleep wear");
			product.setProductprice(Long.parseLong("500.0"));
			product.setSupplierid("sup001");
			product.setCategoryid("cat003");
			product.setQuantity(Integer.parseInt("5"));
			System.out.println("Create Product");
			boolean status=productDAO.addProduct(product);
			Assert.assertEquals("create Product Test Case", true, status);
			
		}
		
		@Test
		public void updateProducttestCase()
		{
			product.setProductid("p001");
			product.setProductname("Saree");
			boolean status=productDAO.updateProduct(product);
			Assert.assertEquals("Update Product Test Case", true, status);
		}
		@Test
		public void deleteProductTestCase()
		{
			product.setProductid("p002");
			Assert.assertEquals("Delete Product Test Case", true, productDAO.deleteProduct(product.getProductid()));
		}
		
		@Test
		public void getProductTestCase()
		{
			Assert.assertEquals("get Product Test Case", null, productDAO.getProductById(""));
		}
		@Test
		public void getAllProductTestCase()
		{
			Assert.assertEquals("Get All Product Test Case", 2, productDAO.getProduct().size());
		}
		

}
