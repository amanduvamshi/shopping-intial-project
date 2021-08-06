package com.shopping.service;

import com.shopping.dao.CategoryDAO;
import com.shopping.dao.ProductDAO;
import com.shopping.model.Product;

public class ProductService {
	
	ProductDAO productDAO = new ProductDAO();
	
	public String createProduct(CategoryDAO categoryDAO,Product product) {
		
		return productDAO.createProduct(categoryDAO, product);
		
	}
	
	public void updateProduct(Product product) {
		
	}
	
	public void deleteProduct(String id) {
		
	}
	
	public void getProduct(String productId) {
		
	}

}
