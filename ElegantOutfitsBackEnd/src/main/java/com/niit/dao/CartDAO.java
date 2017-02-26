package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;
import com.niit.model.Product;

public interface CartDAO {
	
	public List<Cart> cartList(String username);
	public void insertCart(Cart cart);
	public void updateCart(Cart cart);
	public void deleteCart(String productname);
	public Long getMaxId();
	public Long getTotalAmount(String username);
	//public void insertProductInCart(String  productid,int qty,String username);
	
	
	

}
