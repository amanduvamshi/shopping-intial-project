package com.shopping.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public void getAllProductsBasedOnProductType(String productType) {
		Map<String, List<Product>> allProductsByType=new HashMap();
		
		List<Product> products=new ArrayList<Product>();
		
		Product p1=new Product();
		p1.setProductId("T-shirt");
		p1.setProductColor("Yellow");
		p1.setProductName("Levis Men's");
		p1.setProductSize("32");
		
		Product p2=new Product();
		p2.setProductId("T-shirt");
		p2.setProductColor("Red");
		p2.setProductName("Jocky Men's");
		p2.setProductSize("34");
		
		Product p3=new Product();
		p3.setProductId("T-shirt");
		p3.setProductColor("White");
		p3.setProductName("Puma Men's");
		p3.setProductSize("38");
		
		Product p4=new Product();
		p4.setProductId("T-shirt");
		p4.setProductColor("Orange");
		p4.setProductName("Rebook Men's");
		p4.setProductSize("38");
		
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		allProductsByType.put("T-shirt",products);
		
		System.out.println("Based on Id Get All Products:"+allProductsByType.get(productType));
		
		//return allProductsByType.get(productType);
		
		
	}
	

}
