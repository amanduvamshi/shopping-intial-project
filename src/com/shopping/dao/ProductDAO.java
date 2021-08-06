package com.shopping.dao;

import java.util.ArrayList;
import java.util.List;

import com.shopping.controller.CategoryController;
import com.shopping.model.Category;
import com.shopping.model.Product;

public class ProductDAO {
	
private List<Product> products=new ArrayList<Product>();
	
	public String createProduct(CategoryDAO categoryDAO,Product product) {
		
	boolean status=	products.add(product);
	if(status) {
		String categoryId=product.getCategoryId();
	Category category=	categoryDAO.getCategory(categoryId);
	category.setProducts(products);
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
