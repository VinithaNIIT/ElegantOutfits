package com.niit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.dao.ProductDAOImpl;
import com.niit.model.Product;

@Controller
public class ProductController {
	private static Logger log=LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductDAOImpl productDAOImpl;
	
	@RequestMapping(value="/viewproductdetails/{categoryid}")
	public ModelAndView viewproductdetails(@PathVariable String categoryid)
	{
		log.debug("Starting of the Method viewproductdetails");
		Gson gson=new Gson();
		String list=gson.toJson(productDAOImpl.getAllProductByCategoryId(categoryid));
		System.out.println("Categoryid"+categoryid);
		ModelAndView mv=new ModelAndView("viewproductdetails");
		mv.addObject("list",list);
		System.out.println("View Product details"+list);
		log.debug("Ending of the Method viewproductdetails");
		return mv;
	
	}
	
	@RequestMapping(value="/productdetails/{productid}")
	public ModelAndView productdetails(@PathVariable String productid)
	{
		log.debug("Starting of the Method productdetails");
		ModelAndView mv=new ModelAndView("productdetails");
		Product p=productDAOImpl.getProductById(productid);
		mv.addObject("p",p);
		log.debug("Ending of the Method productdetails");
		return mv;
	}
	
	/*@RequestMapping(value="/cart/{productid}")
	public ModelAndView cart(@PathVariable String productid,@RequestParam("qty") String qty )
	{
		log.debug("Starting of the Method cart");
		
		ModelAndView mv=new ModelAndView("cart");
		Product p=productDAOImpl.getProductById(productid);
		mv.addObject("p",p);
		mv.addObject("qty",qty);
		log.debug("Ending of the Method cart");
		return mv;
	}*/
	
	
	
	
	
}
