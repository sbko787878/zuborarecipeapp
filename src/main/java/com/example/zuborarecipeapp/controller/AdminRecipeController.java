package com.example.zuborarecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zuborarecipeapp.entity.Recipe;
import com.example.zuborarecipeapp.service.RecipeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/admin/recipes")
@RequiredArgsConstructor
public class AdminRecipeController {

	private final RecipeService recipeService;

	@GetMapping
	public String list(Model model) {
		model.addAttribute("recipes", recipeService.getAllRecipes());
		return "admin/adminuser";
	}

	// 新規登録フォーム
	@GetMapping("/new")
	public String newForm(Model model) {
		model.addAttribute("recipe", new Recipe());
		return "admin/recipeform";
	}

	// 編集フォーム
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable int id, Model model) {
		model.addAttribute("recipe", recipeService.findRecipeById(id));
		return "admin/recipeform";
	}

	// 保存（新規 or 更新）
	@PostMapping("/save")
	public String save(@ModelAttribute Recipe recipe) {
		if (recipe.getId() == null) {
			recipeService.insertRecipe(recipe); // 新規
		} else {
			recipeService.updateRecipe(recipe); // 更新
		}

		return "redirect:/admin/recipes"; // 保存後に一覧へ戻る
	}

	// 削除
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		recipeService.deleteRecipe(id);
		return "redirect:/admin/recipes";
	}
}