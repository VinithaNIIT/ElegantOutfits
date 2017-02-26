package com.niit.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;


@Controller
public class CategoryController {
	private static Logger log=LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/Admin_category")
	public ModelAndView addcategory( )
	{
		log.debug("Starting of the Method Admin_category");
		 ModelAndView mv=new ModelAndView("category","command",new Category());
		 log.debug("Ending of the Method Admin_category");
	
		
		return mv;
	}		
	@RequestMapping(value="/Admin_categorydetails",method=RequestMethod.POST)
	public String categorydetails(@Valid @ModelAttribute("category")Category category ,BindingResult result)
	{
		log.debug("Starting of the Method Admin_categorydetails");
		new CategoryFormValidator().validate(category, result);

		String returnval="redirect:/Admin_viewcategory";
		if(result.hasErrors())
		{
			System.out.println("Hibernate validation");
			/*return new ModelAndView("redirect:/category");*/
			returnval="redirect:/Admin_category";
			return returnval;
		}
		else{
		boolean status=categoryDAO.insertCategory(category);
		log.debug("Ending of the Method Admin_categorydetails");
		return returnval;
		}
		
		
	}
	@RequestMapping("/Admin_viewcategory")
	public ModelAndView viewcategory()
	{
		log.debug("Starting of the Method Admin_viewcategory");
		List<Category> list=categoryDAO.getCategory();
		log.debug("Ending of the Method Admin_viewcategory");
		return new ModelAndView("viewcategory","list",list);
	}
	
	@RequestMapping("/Admin_editcategory/{categoryid}")
	public ModelAndView editcategory(@PathVariable String categoryid)
	{
		log.debug("Starting of the Method Admin_editcategory");
		Category category=categoryDAO.getCategoryById(categoryid);
		log.debug("Ending of the Method Admin_editcategory");
		return new ModelAndView("editcategory","command",category);
		
	}
	@RequestMapping("/Admin_categorysave")
	public ModelAndView categorysave(@ModelAttribute Category category)
	{
		log.debug("Starting of the Method Admin_categorysave");
		categoryDAO.updateCategory(category);
		log.debug("Ending of the Method Admin_categorysave");
		return new ModelAndView("redirect:/Admin_viewcategory");
	}
	@RequestMapping("/Admin_deletecategory/{categoryid}")
	public ModelAndView deletecategory(@PathVariable String categoryid)
	{
		log.debug("Starting of the Method Admin_deletecategory");
		categoryDAO.deleteCategory(categoryid);
		log.debug("Ending of the Method Admin_deletecategory");
		return new ModelAndView("redirect:/Admin_viewcategory");
	}
	
	
	
}
