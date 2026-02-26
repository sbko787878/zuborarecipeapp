package com.example.zuborarecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zuborarecipeapp.entity.AdminUser;
import com.example.zuborarecipeapp.entity.Recipe;
import com.example.zuborarecipeapp.service.RecipeService;

import jakarta.servlet.http.HttpSession;
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
	public String newForm(Model model,HttpSession session) {
		// セッションから情報を取り出す
		AdminUser loginUser = (AdminUser) session.getAttribute("adminUser");
		if (loginUser == null) {
			// セッションが空ならログイン画面へ強制送還
			return "redirect:/login";
		}
		model.addAttribute("recipe", new Recipe());
		return "admin/recipeform";
	}

	// 編集フォーム
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable int id, Model model,HttpSession session) {
		// セッションから情報を取り出す
		AdminUser loginUser = (AdminUser) session.getAttribute("adminUser");
		if (loginUser == null) {
			// セッションが空ならログイン画面へ強制送還
			return "redirect:/login";
		}

		model.addAttribute("recipe", recipeService.findRecipeById(id));
		return "admin/recipeform";
	}

	// 保存（新規 or 更新）
	@PostMapping("/save")
	public String save(@ModelAttribute Recipe recipe,HttpSession session) {
		// セッションから情報を取り出す
		AdminUser loginUser = (AdminUser) session.getAttribute("adminUser");
		if (loginUser == null) {
			// セッションが空ならログイン画面へ強制送還
			return "redirect:/login";
		}

		if (recipe.getId() == null) {
			recipeService.insertRecipe(recipe); // 新規
		} else {
			recipeService.updateRecipe(recipe); // 更新
		}

		return "redirect:/admin/recipes"; // 保存後に一覧へ戻る
	}

	// 削除
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id,HttpSession session) {
		// セッションから情報を取り出す
		AdminUser loginUser = (AdminUser) session.getAttribute("adminUser");
		if (loginUser == null) {
			// セッションが空ならログイン画面へ強制送還
			return "redirect:/login";
		}
		recipeService.deleteRecipe(id);
		return "redirect:/admin/recipes";
	}
}