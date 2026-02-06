package com.example.zuborarecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recipes")
public class DetailController {
//	Serviceを使うためのフィールド
	private final RecipeService recipeService;
	
//	DI
	public DetailController(RecipeService recipeService) {
		this.recipeService=recipeService;
	}
	
	@GetMapping("/name/{name}")
	public String showDetailName(@PathVariable String name,Model m) {
		Recipe recipe= recipeService.getRecipeName(name);
		m.addAttributes("recipe",recipe);
		return "recipe-detail";
 }
}	

