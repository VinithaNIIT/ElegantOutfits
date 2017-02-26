package com.niit.elegantoutfitsbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;


public class SupplierTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Supplier supplier;
	@Autowired
	static SupplierDAO supplierDAO;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		 supplier=(Supplier)context.getBean("supplier");
		System.out.println("Objects created successfully");
	
	}
	@Test
	public void createsupplierTestCase()
	{
		supplier.setSupplierid("sup001");
		supplier.setSuppliername("Maya");
		supplier.setSupplieraddress("New Delhi");
		System.out.println("Create supplier");
		//boolean status=supplierDAO.insertSupplier(supplier);
		Assert.assertEquals("create supplier Test Case", true, supplierDAO.insertSupplier(supplier));
		
	}
	
	@Test
	public void updatesuppliertestCase()
	{
		supplier.setSupplierid("sup002");
		supplier.setSuppliername("Saritha");
		supplier.setSupplieraddress("Mumbai");
		boolean status=supplierDAO.updateSupplier(supplier);
		Assert.assertEquals("Update supplier Test Case", true, status);
	}
	@Test
	public void deletesupplierTestCase()
	{
		supplier.setSupplierid("sup002");
		Assert.assertEquals("Delete supplier Test Case", true, supplierDAO.deleteSupplier(supplier.getSupplierid()));
	}
	
	@Test
	public void getsupplierTestCase()
	{
		Assert.assertEquals("get supplier Test Case", null, supplierDAO.getSupplierById(""));
	}
	@Test
	public void getAllsupplierTestCase()
	{
		Assert.assertEquals("Get All supplier Test Case", 2, supplierDAO.getSupplier().size());
	}

}
