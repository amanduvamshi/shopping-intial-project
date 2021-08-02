package com.shopping.dao;

import java.util.ArrayList;
import java.util.List;

import com.shopping.controller.CategoryController;
import com.shopping.model.Category;
import com.shopping.model.Product;

public class ProductDAO {
	
private List<Product> products=new ArrayList<Product>();
	
	public String createProduct(Product product) {
		
		boolean isAdded= products.add(product);
		if(isAdded) {
			String categoryId=product.getCategoryId();
			System.out.println("categoryId:"+categoryId);
			Category category=new CategoryController().getCategory(categoryId);
			System.out.println("category:"+category);
			category.setProducts(products);
			return "Product Inserted Successfully.";
		}
			
		return null;
	}
	
	public void updateProduct(Product Product) {
		
	}
	
	public void deleteProduct(String productId) {
		
	}
	
	public void getProduct(String productId) {
		
	}


}
