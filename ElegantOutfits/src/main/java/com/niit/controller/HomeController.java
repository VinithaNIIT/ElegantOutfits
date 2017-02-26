package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAOImpl;
import com.niit.model.Category;




@Controller
public class HomeController {
	
	private static Logger log=LoggerFactory.getLogger(HomeController.class);
	@Autowired
	CategoryDAOImpl categoryDAOImpl;
	
	@Autowired
	Category category;
	@RequestMapping("/")
	public ModelAndView index(HttpSession session)
	{
		log.debug("Starting of the Method /");
	  ModelAndView mv=new ModelAndView("index");
	// session.setAttribute("category",category);
	  List<Category> categorylist=categoryDAOImpl.getCategory();
	  System.out.println("category list"+categorylist);
		mv.addObject("categorylist", categorylist);
		//session.setAttribute("categorylist", categorylist);
		log.debug("Ending of the Method /");
	  return mv;
	}
	
	@RequestMapping("/header")
	public ModelAndView header()
	{
		log.debug("Starting of the Method header");
	  ModelAndView mv=new ModelAndView("header");
	// session.setAttribute("category",category);
	  List<Category> categorylist=categoryDAOImpl.getCategory();
	  System.out.println("category list"+categorylist);
		mv.addObject("categorylist", categorylist);
		//session.setAttribute("categorylist", categorylist);
		log.debug("Ending of the Method header");
	  return mv;
	}
	
	@RequestMapping("/Index")
	public ModelAndView indexpage()
	{
		log.debug("Starting of the Method Index");
	  ModelAndView mv=new ModelAndView("index");	
	  log.debug("Ending of the Method Index");
	  return mv;
	}
	@RequestMapping("/Aboutus")
	public ModelAndView aboutus()
	{
		log.debug("Starting of the Method Aboutus");
	  ModelAndView mv=new ModelAndView("aboutus");	
	  log.debug("Ending of the Method Aboutus");
	  return mv;
	}
	@RequestMapping("/Contactus")
	public ModelAndView contactus()
	{
		log.debug("Starting of the Method Contactus");
	  ModelAndView mv=new ModelAndView("contactus");	
	  log.debug("Ending of the Method Contactus");
	  return mv;
	}
	
	
	@RequestMapping("/Registration")
	public ModelAndView register()
	{
		log.debug("Starting of the Method Registration");
	  ModelAndView mv=new ModelAndView("registration");	
	  log.debug("Ending of the Method Registration");
	  return mv;
	}
	@RequestMapping("/Login")
	public ModelAndView login()
	{
		log.debug("Starting of the Method Login");
	  ModelAndView mv=new ModelAndView("login");	
	  log.debug("Ending of the Method Login");
	  return mv;
	}
	@RequestMapping("/Admin_Supplierfront")
	public ModelAndView supplier()
	{
		log.debug("Starting of the Method Admin_Supplierfront");
	  ModelAndView mv=new ModelAndView("supplierfront");	
	  log.debug("Ending of the Method Admin_Supplierfront");
	  return mv;
	}
	
	
	
	@RequestMapping("/Admin_categoryfront")
	public ModelAndView category()
	{
		log.debug("Starting of the Method Admin_categoryfront");
	  ModelAndView mv=new ModelAndView("categoryfront");
	  log.debug("Ending of the Method Admin_categoryfront");
	  return mv;
	}
	
	@RequestMapping("/Admin_productfront")
	public ModelAndView product()
	{
	  ModelAndView mv=new ModelAndView("productfront");	
	  return mv;
	}
	
	@RequestMapping("/adminlogin")
	public ModelAndView adminlogin()
	{
		log.debug("Starting of the Method adminlogin");
	  ModelAndView mv=new ModelAndView("adminlogin");
	  log.debug("Ending of the Method adminlogin");
	  return mv;
	}
	@RequestMapping("/Admin")
	public ModelAndView admin()
	{
		log.debug("Starting of the Method Admin");
	  ModelAndView mv=new ModelAndView("adminhome");
	  log.debug("Ending of the Method Admin");
	  return mv;
	}
	
	@RequestMapping("/adminloginerror")
	public ModelAndView adminloginerror()
	{
		log.debug("Starting of the Method adminloginerror");
	  ModelAndView mv=new ModelAndView("adminloginerror");	
	  log.debug("Ending of the Method adminloginerror");
	  return mv;
	}

}
