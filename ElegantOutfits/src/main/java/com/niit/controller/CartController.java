package com.niit.controller;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.dao.CartDAOImpl;
import com.niit.dao.ProductDAOImpl;
import com.niit.model.Cart;
import com.niit.model.Product;



@Controller
public class CartController {
	private static Logger log=LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	CartDAOImpl cartDAOImpl;
	@Autowired
	ProductDAOImpl productDAOImpl;
	@Autowired
	Cart cart;
	
	/*@RequestMapping("/cart_checkout")
	public ModelAndView cart(HttpSession session,HttpServletRequest request,@ModelAttribute Cart cart)
	{
		log.debug("Starting of the method Cart");
		//model.addAttribute("cart",new Cart());
		session=request.getSession();
		if(session.getAttribute("username").equals(null))
		{
			log.debug("Ending of the method Cart");
			return new ModelAndView("/login");
		}
		else
		{
			cartDAOImpl.insertCart(cart);
			return new ModelAndView("/shippingaddress");
		}
		
		
		
	}*/
	@RequestMapping("/cart_checkout")
	public ModelAndView cart(HttpServletRequest request,HttpSession session)
	{
		log.debug("Starting of the method Cart_Checkout");
		/*model.addAttribute("cart",new Cart());*/
		ModelAndView mv=new ModelAndView("shippingaddress");
	/*	String gtotal=request.getParameter("g");*/
		/*System.out.println("Grandtotal cart controller"+gtotal);*/
		
		log.debug("Ending of the method Cart_Checkout");
			return mv;
		
	}
	
	@RequestMapping("/cart/{productid}")
	public ModelAndView addcart(@PathVariable String productid,@RequestParam("qty") String qty,HttpSession session,HttpServletRequest request,@ModelAttribute Cart cart)
	{
		log.debug("Starting of the method AddCart");
		session=request.getSession(false);
		String username=(String)session.getAttribute("username");
		if(username == null)
		{
			log.debug("Ending of the method Cart");
			return new ModelAndView("login");
		}
		else{
		
		Product product=productDAOImpl.getProductById(productid);
		cart.setProductid(product.getProductid());
		cart.setPrice(product.getProductprice());
		cart.setProductname(product.getProductname());
		cart.setUsername(username);
		//cart.setStatus('N');
		//cart.setCartid(ThreadLocalRandom.current().nextLong(100));
		int q=Integer.parseInt(qty);
		cart.setQuantity(q);
		cart.setDate_added(new Date());
		System.out.println("INSERT CART CONTROLLER"+cart);
		cartDAOImpl.insertCart(cart);
		
		return new ModelAndView("redirect:/m1");
		}
		
	}
	
	@RequestMapping("m1")
	public ModelAndView m1(HttpServletRequest request,HttpSession session)
	{
		ModelAndView mv=new ModelAndView("cart");
		Gson gson=new Gson();
		session=request.getSession(false);
		String username=(String)session.getAttribute("username");
		List<Cart> cart1 =cartDAOImpl.cartList(username);
		String p=gson.toJson(cart1);
		mv.addObject("p",p);
		System.out.println("GSON VALUE:"+p);
		Long total=(Long)cartDAOImpl.getTotalAmount(username);
		mv.addObject("g",total);
		session.setAttribute("grandtotal", total);
		return mv;
	}
	@RequestMapping("/removeproduct/{productid}")
	public ModelAndView removecart(@PathVariable String productid)
	{
		log.debug("Starting of the Method removecart");
		cartDAOImpl.deleteCart(productid);
		log.debug("Ending of the Method removecart");
		return new ModelAndView("redirect:/m1");
		
		
	}
	
	
	
	
	/*@RequestMapping("/cart/{productid}")
	public ModelAndView addProductToCart(@PathVariable String productid,@RequestParam("qty") int qty,HttpSession session,HttpServletRequest request,@ModelAttribute Cart cart)
	{
		System.out.println("CART CONTROLLER::addProductToCart");
		log.debug("Starting of the Method addProductToCart");
		session=request.getSession();
		String username=(String)session.getAttribute("username");
		if(username == null)
		{
			log.debug("Ending of the method Cart");
			return new ModelAndView("/login");
		}
		else{
		ModelAndView mv=new ModelAndView("cart");
		cartDAOImpl.insertProductInCart(productid,qty);
		cartDAOImpl.insertCart(cart);
		Product pro=productDAOImpl.getProductById(productid);
		mv.addObject("p",pro);
		mv.addObject("qty",qty);
		Gson gson=new Gson();
		session=request.getSession(false);
		//String username=(String)session.getAttribute("username");
			List<Cart> cart1 =cartDAOImpl.cartList(username);
			System.out.println("Inside cartController:"+cart1);
			String p=gson.toJson(cart1);
			mv.addObject("p",p);
		log.debug("Ending of the Method addProductToCart");
		return mv;
		
		}
	}*/
	

}
