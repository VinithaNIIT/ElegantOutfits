package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
	
	public boolean addProduct(Product product);
	public List<Product> getProduct();
	public Product getProductById(String productid);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(String productid);
	public List<Product> getAllProduct();
	public List<Product> getAllProductByCategoryId(String categoryid );
	

}
