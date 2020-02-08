package com.meedo.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.meedo.shoppingbackend.dao.CategoryDAO;
import com.meedo.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	/*
	 * Handling The Home Page Request:
	 * */
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","HOME");
		// Load the category list:
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	/*
	 * Handling The Contact Us Page Request:
	 * */
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		
		mv.addObject("userClickContact", true);
			
		return mv;
	}
	
	/*
	 * Handling The About Us Page Request:
	 * */
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		
		mv.addObject("userClickAbout", true);
			
		return mv;
	}
	/*
	 * Handling The View All Products Request:
	 * */
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		
		//Loads all the category list.
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickAllProducts", true);
		
		return mv;
	}
	
	/*
	 * Handling The All Products By Category Request:
	 * */
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mv = new ModelAndView("page");
		
		Category cat = new Category();
		cat = categoryDAO.get(id);
		
		mv.addObject("title", cat.getName());
		// Model by id  is  loaded.
		mv.addObject("category", cat);
		
		// Load the category list.
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickCategoryProducts",true);
		
		return mv;
	}
}





















