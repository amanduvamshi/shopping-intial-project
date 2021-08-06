package com.shopping.dao;

import java.util.ArrayList;
import java.util.List;

import com.shopping.model.Category;

public class CategoryDAO {
	
	public List<Category> categories=new ArrayList<Category>();
	
	public String createCategory(Category category) {
		categories.add(category);
	return null;
	}
	
	public void updateCategory(Category category) {
		
	}
	
	public void deleteCategory(String categoryId) {
		
	}
	
	public Category getCategory(String categoryId) {
		
		System.out.println("Entered into getCategory...");
		System.out.println("Categories..."+categories);
		for(int i=0;i<categories.size();i++) {
			if(categories.get(i).getCategoryId().equals(categoryId)) {
				System.out.println("Category Found With Given Id."+categoryId);
			System.out.println(categories.get(i));
			return categories.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "CategoryDAO [categories=" + categories + "]";
	}
	
	
}
