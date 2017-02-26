package com.niit.webflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.niit.controller.CategoryController;
import com.niit.model.BillingAddress;
import com.niit.model.Cart;
import com.niit.model.Orders;
import com.niit.model.PaymentMethod;
import com.niit.model.Product;
import com.niit.model.ShippingAddress;

@Component
public class OrderWebFlow {
	private static Logger log=LoggerFactory.getLogger(OrderWebFlow.class);
	
	@Autowired
	ShippingAddress shippingaddress;
	
	@Autowired
	BillingAddress billingaddress;
	@Autowired
	Cart cart;
	@Autowired
	PaymentMethod paymentmethod;
	@Autowired
	Orders order;
	@Autowired
	Product product;
	
	public Orders initFlow()
	{
		log.debug("WEBFLOW-->Starting of the method initflow");
		order=new Orders();
		log.debug("WEBFLOW-->Ending of the method initflow");
		return order;
	}
	
	public String addShippingAddress(Orders order,ShippingAddress shippingaddress)
	{
		log.debug("WEBFLOW-->Starting of the method addshippingaddress");
		try{
			order.setShippingaddress(shippingaddress);
			
		}
		catch(Exception ex){ex.printStackTrace();
		return "failure";}
		log.debug("WEBFLOW-->Ending of the method addshippingaddress");
		return "success";
		
	}
	public String addBillingAddress(Orders order,BillingAddress billingaddress)
	{
		log.debug("WEBFLOW-->Starting of the method addBillingAddress");
		try{
			order.setBillingaddress(billingaddress);
			
		}
		catch(Exception ex){ex.printStackTrace();
		return "failure";}
		log.debug("WEBFLOW-->Ending of the method addBillingAddress");
		return "success";
		
	}
	/*public String addPaymentMethod(Orders order,PaymentMethod paymentmethod)
	{
		log.debug("WEBFLOW-->Starting of the method addPaymentMethod");
		try{
			order.setPaymentmethod(paymentmethod);
			
		}
		catch(Exception ex){ex.printStackTrace();return "failure";}
		log.debug("WEBFLOW-->Ending of the method addPaymentMethod");
		return "success";
		
	}*/

}
