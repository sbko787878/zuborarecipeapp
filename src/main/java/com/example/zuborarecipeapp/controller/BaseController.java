package com.example.zuborarecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zuborarecipeapp.service.RecipeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class BaseController {

	private final RecipeService recipeService;

	// --- 1. 初期表示 ---
	@GetMapping("/")
	public String showRecipeList(Model model) {
		// レシピリストの取得
		model.addAttribute("allRecipeList", recipeService.getAllRecipes());
		// アイコンリストの取得
		model.addAttribute("allIconList", recipeService.getAllIcons());

		return "base";
	}
}
