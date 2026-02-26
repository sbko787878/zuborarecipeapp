package com.example.zuborarecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zuborarecipeapp.entity.Recipe;
import com.example.zuborarecipeapp.service.RecipeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class DetailController {
	final RecipeService recipeService;

	@GetMapping("/recipeList/{id}")
	public String showDetailName(@PathVariable("id") int id, Model m) {
		Recipe detailRecipe = recipeService.findRecipeById(id);

		// AでもBでも見つからなかった場合（不正なIDなど）、エラーを防ぐためにリダイレクト
		if (detailRecipe == null) {
			return "redirect:/"; // または "error" ページなど
		}

		m.addAttribute("detailRecipe", detailRecipe);
		return "detail";
	}
}
