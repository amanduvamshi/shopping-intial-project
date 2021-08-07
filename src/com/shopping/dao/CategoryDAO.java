package com.shopping.dao;

import java.util.HashMap;
import java.util.Map;

import com.shopping.model.Category;

public class CategoryDAO {
	
	private final static Map<String , Category> categories =new HashMap<>();
	
	public String createCategory(Category category) {	
		
		categories.put(category.getCategoryId(), category);
		System.out.println(categories);
			
	return null;
	}

	public Category getCategory(String categoryId) {
		System.out.println("based on id get category::"+categories.get(categoryId));
		return null;
	}

	
	
	
}
