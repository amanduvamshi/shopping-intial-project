package TestCases;

import com.shopping.controller.CategoryController;
import com.shopping.controller.ProductController;
import com.shopping.dao.CategoryDAO;
import com.shopping.model.Category;
import com.shopping.model.Product;

public class Test {

	public static void main(String[] args) {
		
		Category category=new Category();
		category.setCategoryId("cloths-men");
		category.setCategoryName("Cloths For Men");
		
		CategoryController categoryController=new CategoryController();
		categoryController.createCategory(category);
		System.out.println(categoryController.getCategoryService().getCategoryDAO());
	
		
	}

}
