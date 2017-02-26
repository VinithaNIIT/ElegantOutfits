package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {
	
	public boolean insertCategory(Category category);
	public List<Category> getCategory();
	public Category getCategoryById(String categoryid);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(String categoryid);
	public List<Category> getCategoryList();

}
