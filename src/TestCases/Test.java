package TestCases;

import com.shopping.controller.CategoryController;
import com.shopping.controller.ProductController;
import com.shopping.model.Category;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * Category category=new Category(); category.setCategoryId("m1");
		 * category.setCategoryName("cloths ");
		 * 
		 * Category category1=new Category(); category1.setCategoryId("m2");
		 * category1.setCategoryName("cosmetic");
		 * 
		 * CategoryController categoryController=new CategoryController();
		 * categoryController.createCategory(category);
		 * categoryController.createCategory(category1);
		 * 
		 * categoryController.getCategory("m1");
		 */
		
		ProductController pC=new ProductController();
		pC.getAllProductsBasedOnProductType("T-shirt");
		
		
	}

}
