package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.OrdersDAOImpl;
import com.niit.model.Orders;
import com.niit.model.ShippingAddress ;
import com.niit.model.User;
import com.niit.model.BillingAddress;
import com.niit.model.Cart; ;

@Controller
public class OrdersController {
	private static Logger log=LoggerFactory.getLogger(CartController.class);
	@Autowired
	OrdersDAOImpl orderDAOImpl;
	@Autowired
	ShippingAddress shippingaddress;
	@Autowired
	BillingAddress billingaddress;
	@Autowired
	Cart cart;
	@Autowired
	User user;

	@RequestMapping("/shippingaddress")
	public ModelAndView ShippingAddress(@ModelAttribute ShippingAddress shippingaddress,HttpSession session,HttpServletRequest request)
	{
		log.debug("Starting of the method ShippingAddress");
		/*model.addAttribute("cart",new Cart());*/
		ModelAndView mv=new ModelAndView("billingaddress");
		session=request.getSession(false);
		String username=(String)session.getAttribute("username");
		shippingaddress.setUsername(username);
		orderDAOImpl.insertShippingAddress(shippingaddress);
		log.debug("Ending of the method ShippingAddress");
			return mv;
		
	}
	@RequestMapping("/billingaddress")
	public ModelAndView BillingAddress(@ModelAttribute BillingAddress billingaddress,HttpSession session,HttpServletRequest request)
	{
		log.debug("Starting of the method BillingAddress");
		/*model.addAttribute("cart",new Cart());*/
		ModelAndView mv=new ModelAndView("paymentmethod");
		session=request.getSession(false);
		String username=(String)session.getAttribute("username");
		billingaddress.setUsername(username);
		orderDAOImpl.insertBillingAddress(billingaddress);
		log.debug("Ending of the method BillingAddress");
			return mv;
		
	}
	
	
	@RequestMapping("/paymentmethod")
	public ModelAndView insertorder(@ModelAttribute Orders order,HttpServletRequest request,HttpSession session)
	{
		log.debug("Starting of the method InsertOrder");
		ModelAndView mv=new ModelAndView("orderconfirmed");
		String paymentmethod=request.getParameter("payment");
		order.setPaymentmethod(paymentmethod);
		session=request.getSession(false);
		String username=(String)session.getAttribute("username");
		shippingaddress=orderDAOImpl.getShippingByUsername(username);
		billingaddress=orderDAOImpl.getBillingByUsername(username);
		cart=orderDAOImpl.getCartByUsername(username);
		order.setUsername(username);
		order.setShippingaddress(shippingaddress);
		order.setBillingaddress(billingaddress);
		order.setCart(cart);
		System.out.println("Order value controller"+order);
		Long val=(Long)session.getAttribute("grandtotal");
		System.out.println("Order controller GRAND TOTAL"+val);
		//Long gtotal=Long.parseLong(val);
		order.setGrandtotal(val);
		orderDAOImpl.insertOrder(order);
		System.out.println("insert oredr Controller:"+order);
		List<Orders> orders=orderDAOImpl.orderList(username);
		mv.addObject("orders",orders);
		List<ShippingAddress> shipping=orderDAOImpl.shippingAddressList(username);
		mv.addObject("shipping", shipping);
		List<BillingAddress> billing=orderDAOImpl.billingAddressList(username);
		mv.addObject("billing", billing);
		log.debug("Ending of the method InsertOrder");
		return mv;
		
		
		
	}

}
