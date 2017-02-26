package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Category {
	
	@Id
	@NotEmpty(message="Id cannot be null")
	private String categoryid;
	//@NotNull(message="CategoryName cannot be null")
	//@Range(min=3,max=30,message="Your name should be between 3 - 30 characters.")
	private String categoryname;
	//@NotNull(message="CategoryDescription cannot be null")
	//@Size(min=5,max=50,message="Your name should be between 5 - 50 characters.")
	private String categorydescription;
	/*private Set<Product> products;
	
	@OneToMany(mappedBy="category",fetch=FetchType.EAGER)
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}*/
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategorydescription() {
		return categorydescription;
	}
	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}
	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", categoryname=" + categoryname + ", categorydescription="
				+ categorydescription + "]";
	}

}
