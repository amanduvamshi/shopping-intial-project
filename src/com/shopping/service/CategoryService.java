package com.shopping.service;

import com.shopping.dao.CategoryDAO;
import com.shopping.model.Category;

public class CategoryService {
	
	CategoryDAO categoryDAO=new CategoryDAO();
	
	public String createCategory(Category category) {
		return null;
		
	}
	
	public void updateCategory(Category category) {
		
	}
	
	public void deleteCategory(String categoryId) {
		
	}

	public Category getCategory(String categoryId) {
		return categoryDAO.getCategory(categoryId);
	}
	
	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}
}
