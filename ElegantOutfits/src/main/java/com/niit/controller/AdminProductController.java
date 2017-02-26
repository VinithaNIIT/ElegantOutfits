package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAOImpl;
import com.niit.dao.ProductDAOImpl;
import com.niit.dao.SupplierDAOImpl;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;


@Controller
public class AdminProductController {
	
	private static Logger log=LoggerFactory.getLogger(AdminProductController.class);
	
	@Autowired
	CategoryDAOImpl categoryDAOImpl;
	
	@Autowired
	SupplierDAOImpl supplierDAOImpl;
	
	@Autowired
	ProductDAOImpl productDAOImpl;
	
	/*@RequestMapping("/productlist")
	public ModelAndView product(@ModelAttribute Product product)
	{
		ModelAndView mv=new ModelAndView("product");
		List<Supplier> supplierlist=supplierDAOImpl.getSupplierList();
		mv.addObject("supplierlist", supplierlist);
		List<Category> categorylist=categoryDAOImpl.getCategoryList();
		mv.addObject("categorylist", categorylist);
		mv.addObject("command", new Product());
		
		return mv;
		
	}*/
	@RequestMapping(value="/Admin_productdetails",method=RequestMethod.POST)
	public ModelAndView productdetails(@ModelAttribute Product product)
	{
		log.debug("Starting of the Method Admin_productdetails");
		String filename=null;
		byte[] arr;
		if(!product.getFile().isEmpty())
		{
			try{
		arr=product.getFile().getBytes();
		productDAOImpl.addProduct(product);
		System.out.println("Insert product:"+product);
		String path="E:/Elegant Outfits/ElegantOutfits/src/main/webapp/resources/images/"+product.getProductid()+".jpg";
		File f=new File(path);
		BufferedOutputStream bf=new BufferedOutputStream(new FileOutputStream(f));
		bf.write(arr);
		bf.close();
		System.out.println("Image Uploaded");
		
		}
			catch(Exception e){System.out.println(e.getMessage());}
		}
		log.debug("Ending of the Method Admin_productdetails");
		return new ModelAndView("redirect:/Admin_viewproduct");
	}
	@RequestMapping("/Admin_viewproduct")
	public ModelAndView viewproduct()
	{
		log.debug("Starting of the Method Admin_viewproduct");
		List<Product>list=productDAOImpl.getProduct();
		return new ModelAndView("viewproduct","list",list);
	}
	@RequestMapping("/Admin_product")
	public ModelAndView addproduct(@ModelAttribute Product product)
	{
	  ModelAndView mv=new ModelAndView("product","command",new Product());
	  List<Supplier> supplierlist=supplierDAOImpl.getSupplierList();
		mv.addObject("supplierlist", supplierlist);
		List<Category> categorylist=categoryDAOImpl.getCategoryList();
		mv.addObject("categorylist", categorylist);
		log.debug("Ending of the Method Admin_viewproduct");
		 return mv;
	}
	@RequestMapping(value="/Admin_editproduct/{productid}")
	public ModelAndView editsupplier(@PathVariable String productid)
	{
		log.debug("Starting of the Method Admin_editproduct");
		Product product=productDAOImpl.getProductById(productid);
		log.debug("Ending of the Method Admin_editproduct");
		return new ModelAndView("editproduct","command",product);
	}
	@RequestMapping("/Admin_productsave")
	public ModelAndView productsave(@ModelAttribute Product product)
	{
		log.debug("Starting of the Method Admin_productsave");
		productDAOImpl.updateProduct(product);
		log.debug("Ending of the Method Admin_productsave");
		return new ModelAndView("redirect:/Admin_viewproduct");
	}
	@RequestMapping("/Admin_deleteproduct/{productid}")
	public ModelAndView deleteproduct(@PathVariable String productid)
	{
		log.debug("Starting of the Method Admin_deleteproduct");
		productDAOImpl.deleteProduct(productid);
		log.debug("Ending of the Method Admin_deleteproduct");
		return new ModelAndView("redirect:/Admin_viewproduct");
	}

}
