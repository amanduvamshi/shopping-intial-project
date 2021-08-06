package com.shopping.controller;

import com.shopping.model.Category;
import com.shopping.service.CategoryService;

public class CategoryController {
	
	CategoryService categoryService = new CategoryService();
	
	public String createCategory(Category category) {
		return categoryService.createCategory(category);
	}
	
	public void updateCategory(Category category) {
		
	}
	
	public void deleteCategory(String id) {
		
	}
	
	public Category getCategory(String categoryId) {
		return categoryService.getCategory(categoryId);
	}
	
	public CategoryService getCategoryService() {
		return categoryService;
	}
	

}
