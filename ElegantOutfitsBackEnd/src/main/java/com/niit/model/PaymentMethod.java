package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;
@Component
public class PaymentMethod implements Serializable {
	
	private String paymentmethod;

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

}
