package com.shopping.controller;

import com.shopping.dao.CategoryDAO;
import com.shopping.model.Product;
import com.shopping.service.ProductService;

public class ProductController {
	
	ProductService productService = new ProductService();
	
	public String createProduct(CategoryDAO categoryDAO, Product product) {
		return productService.createProduct(categoryDAO,product);		
	}
	public void updateProduct(Product product) {
		
	}
	public void deleteProduct(String productId) {
		
	}
	public Product getProduct(String productId) {
		return null;
	}

}
