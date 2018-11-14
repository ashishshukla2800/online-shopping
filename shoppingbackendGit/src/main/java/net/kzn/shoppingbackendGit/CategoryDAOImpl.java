package net.kzn.shoppingbackendGit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackendGit.dao.CategoryDAO;
import net.kzn.shoppingbackendGit.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl  implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<>();
	
	static {//At the time of class created it will be initialise by these values for that we use static block
		
		Category  category=new Category();
		
		//adding first category
		category.setId(1);
		category.setName("television");
		category.setDiscription("this is discription for television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		//adding second category
		category=new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDiscription("this is discription for mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		
		//adding third category
		category=new Category();
		category.setId(3);
		category.setName("laptop");
		category.setDiscription("this is discription for laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category:categories) {
			if(category.getId()==id) 
				return category;
			}
		return null;
	}

}
