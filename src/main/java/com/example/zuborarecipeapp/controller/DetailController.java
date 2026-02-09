package com.example.zuborarecipeapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zuborarecipeapp.entity.Recipe;
import com.example.zuborarecipeapp.service.RecipeService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("recipes")
public class DetailController {
	final RecipeService recipeService;

	@GetMapping("/name/{id}")
	public String showDetailName(@PathVariable int id, Model m, HttpSession session) {
		List<Recipe> recipeList = (List<Recipe>) session.getAttribute("recipeList");

		if (recipeList == null) {
			// NULL対策、セッションにない場合はサービスを使ってDBから直接取得する
			Recipe detailRecipe = recipeService.findRecipeById(id);
			m.addAttribute("detailRecipe", detailRecipe);
			return "detail";
		} else {
			Recipe detailRecipe = null;
			for (Recipe recipe : recipeList) {
				// リスト内の各レシピのIDと、URLのIDを比較
				if (recipe.getId() == id) {
					detailRecipe = recipe; // 一致したら変数に保存
					break; // 見つかったのでループを抜ける
				}
			}
			m.addAttribute("detailRecipe", detailRecipe);
			return "detail";
		}
	}
}
