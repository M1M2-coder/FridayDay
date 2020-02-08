package com.meedo.shoppingbackend.dao;

import java.util.List;

import com.meedo.shoppingbackend.dto.Category;

public interface CategoryDAO {
		List<Category> list();
		
		Category get(int id);
		
		
		
		
		
}
