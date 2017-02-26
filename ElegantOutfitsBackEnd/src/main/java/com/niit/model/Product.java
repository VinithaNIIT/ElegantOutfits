package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@Entity
public class Product implements Serializable {

	@Id
	private String productid;
	private String productname;
	private String productdescription;
	private Long productprice;
	
	private String supplierid;
	private String categoryid;
	private int quantity;
	@Transient
	private MultipartFile file;
	/*
	@ManyToOne
	@JoinColumn(name="categoryid",updatable=false,insertable=false,nullable=false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="supplierid",updatable=false,insertable=false,nullable=false)
	private Supplier supplier;*/
	
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Long getProductprice() {
		return productprice;
	}
	public void setProductprice(Long productprice) {
		this.productprice = productprice;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productdescription="
				+ productdescription + ", productprice=" + productprice + ", supplierid=" + supplierid + ", categoryid="
				+ categoryid + ", quantity=" + quantity + "]";
	}
	
	
}
