package com.niit.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.SupplierDAOImpl;
import com.niit.model.Supplier;

@Controller
public class SupplierController {
	private static Logger log=LoggerFactory.getLogger(SupplierController.class);
	
	@Autowired
	SupplierDAOImpl supplierDAO;
	
	@RequestMapping("/Admin_Supplierdetails")
	public ModelAndView supplierdetails(@ModelAttribute Supplier supplier)
	{
		log.debug("Starting of the Method Admin_Supplierdetails");
		supplierDAO.insertSupplier(supplier);
		System.out.println("Inside controller"+supplier);
		log.debug("Ending of the Method Admin_Supplierdetails");
		return new ModelAndView("redirect:/Admin_viewsupplier");
	}
	
	/*@RequestMapping("/Supplierdetails")
	public ModelAndView supplierdetails(@RequestParam("suppliername") String suppliername, @RequestParam("supplierdescription") String supplierdescription)
	{
	   Supplier supplier=new Supplier();
	   supplier.setSuppliername(suppliername);
	   supplier.setSupplierdescription(supplierdescription);
		supplierDAO.insertSupplier(supplier);
		System.out.println("Inside controller"+supplier);
		return new ModelAndView("error");
	}*/
	
	@RequestMapping("/Admin_viewsupplier")
	public ModelAndView viewsupplier()
	{
		log.debug("Starting of the Method Admin_viewsupplier");
		
		List<Supplier> vlist=supplierDAO.getSupplier();
		log.debug("Ending of the Method Admin_viewsupplier");
		return new ModelAndView("viewsupplier","vlist",vlist);
	}
	
	@RequestMapping("/Admin_supplier")
	public ModelAndView addsupplier()
	{
		log.debug("Starting of the Method Admin_supplier");
	  ModelAndView mv=new ModelAndView("supplier","command",new Supplier());
	  log.debug("Ending of the Method Admin_supplier");
	  return mv;
	}
	@RequestMapping(value="/Admin_editsupplier1/{supplierid}")
	public ModelAndView editsupplier(@PathVariable String supplierid)
	{
		log.debug("Starting of the Method Admin_editsupplier1");
		Supplier supplier=supplierDAO.getSupplierById(supplierid);
		log.debug("Ending of the Method Admin_editsupplier1");
		return new ModelAndView("editsupplier","command",supplier);
	}
	@RequestMapping(value="/Admin_editsave")
	public ModelAndView editsave(@ModelAttribute("supplier")Supplier supplier)
	{
		log.debug("Starting of the Method Admin_editsave");
		
		supplierDAO.updateSupplier(supplier);
		log.debug("Ending of the Method Admin_editsave");
		return new ModelAndView("redirect:/Admin_viewsupplier");
	}
	@RequestMapping("/Admin_deletesupplier/{supplierid}")
	public ModelAndView deletesupplier(@PathVariable String supplierid)
	{
		log.debug("Starting of the Method Admin_deletesupplier");
		System.out.println("deletesupplier controller"+supplierid);
		supplierDAO.deleteSupplier(supplierid);
		System.out.println("deletesupplier controller1"+supplierid);
		log.debug("Ending of the Method Admin_deletesupplier");
		return new ModelAndView("redirect:/Admin_viewsupplier");
		
	}

}
