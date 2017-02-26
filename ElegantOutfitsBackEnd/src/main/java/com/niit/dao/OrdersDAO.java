package com.niit.dao;

import java.util.List;

import com.niit.model.BillingAddress;
import com.niit.model.Cart;
import com.niit.model.Orders;
import com.niit.model.ShippingAddress;

public interface OrdersDAO {
	
	public void insertOrder(Orders order);
	public void insertShippingAddress(ShippingAddress shippingaddress);
	public void insertBillingAddress(BillingAddress billingaddress);
	public ShippingAddress getShippingByUsername(String username);
	public BillingAddress getBillingByUsername(String username);
	public Cart getCartByUsername(String username);
	public List<Orders> orderList(String username);
	public List<ShippingAddress> shippingAddressList(String username);
	public List<BillingAddress> billingAddressList(String username);
	

}
