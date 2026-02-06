package com.example.zuborarecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
//@RequiredArgsController
public class BaseController {
	
//	Serviceを使うためのフィールド
	private final RecipeService recipeService;
	
//	DI
	public BaseController(RecipeService recipeService) {
		this.recipeService=recipeService;
	}
	
	@GetMapping
	public String showRecipeList(Model m) {
		m.addAttributes("recipes",recipeService.getAllRecipe());
		return "recipe";
    }
}
