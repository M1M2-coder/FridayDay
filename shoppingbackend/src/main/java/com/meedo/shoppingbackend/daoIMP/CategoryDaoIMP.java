package com.meedo.shoppingbackend.daoIMP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.meedo.shoppingbackend.dao.CategoryDAO;
import com.meedo.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDaoIMP implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	static {
		Category category  = null; 
		category = new Category();
		// First Category:
		category.setId(1);
		category.setName("Labtop");
		category.setDescription("Here all the Information about Labtop");
		category.setImageUrl("Cat_1.png");
		categories.add(category);
		
		// Second Category:
		category = new Category();
		category.setId(2);
		category.setName("Television");
		category.setDescription("Here all the Information about TVs");
		category.setImageUrl("Cat_2.png");
		categories.add(category);
		
		// First Category:
		category = new Category();
		category.setId(3);
		category.setName("Mobile");
		category.setDescription("Here all the Information about Mobile");
		category.setImageUrl("Cat_3.png");
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		return categories;
	}
	@Override
	public Category get(int id) {
		for(Category cat: categories) {
			if(cat.getId() == id) return cat;
		}
		return null;
	}

}
