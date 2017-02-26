package com.niit.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Supplier implements Serializable {
	
	@Id
	private String supplierid;
	private String suppliername;
	private String supplieraddress;
	
/*private Set<Product> products;
	
	@OneToMany(mappedBy="supplier",fetch=FetchType.EAGER)
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}*/
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSupplieraddress() {
		return supplieraddress;
	}
	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}
	@Override
	public String toString() {
		return "Supplier [supplierid=" + supplierid + ", suppliername=" + suppliername + ", supplieraddress="
				+ supplieraddress + "]";
	}
	
	
	
}
