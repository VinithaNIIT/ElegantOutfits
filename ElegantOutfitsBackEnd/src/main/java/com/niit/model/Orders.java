package com.niit.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;



@Component
@Entity
public class Orders implements Serializable{
	
	@Id
	private String orderid;
	
	private String username;
	@OneToOne(cascade=CascadeType.PERSIST)
	private ShippingAddress shippingaddress;
	@OneToOne(cascade=CascadeType.PERSIST)
	private BillingAddress billingaddress;
	@OneToOne(cascade=CascadeType.PERSIST)
	private Cart cart;
	
	private Long grandtotal;
	private String paymentmethod;
	
	public Orders()
	{
		this.orderid="ORD"+UUID.randomUUID();
	}
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ShippingAddress getShippingaddress() {
		return shippingaddress;
	}
	public void setShippingaddress(ShippingAddress shippingaddress) {
		this.shippingaddress = shippingaddress;
	}
	public BillingAddress getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(BillingAddress billingaddress) {
		this.billingaddress = billingaddress;
	}
	
	public Long getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(Long grandtotal) {
		this.grandtotal = grandtotal;
	}
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", username=" + username+ ", shippingaddress=" + shippingaddress
				+ ", billingaddress=" + billingaddress+ ", cartid=" + cart + ", grandtotal=" + grandtotal
				+ ", paymentmethod=" + paymentmethod + "]";
	}
	

}
