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
@RequestMapping
public class DetailController {
	final RecipeService recipeService;

	@GetMapping("/recipeList/{id}")
	public String showDetailName(@PathVariable("id") int id, Model m, HttpSession session) {
		Recipe detailRecipe=null;
		List<Recipe> allRecipeList = (List<Recipe>) session.getAttribute("allRecipeList");

		if (allRecipeList == null) {
			// NULL対策、セッションにない場合はサービスを使ってDBから直接取得する
			detailRecipe = recipeService.findRecipeById(id);
			m.addAttribute("detailRecipe", detailRecipe);
			return "detail";
		} else {
			for (Recipe recipe : allRecipeList) {
				// リスト内の各レシピのIDと、URLのIDを比較
				if (recipe.getId() == id) {
					detailRecipe = recipe; // 一致したら変数に保存
					break; // 見つかったのでループを抜ける
				}
			}
			// --- 最終チェック ---
			// AでもBでも見つからなかった場合（不正なIDなど）、エラーを防ぐためにリダイレクト
			if (detailRecipe == null) {
				return "redirect:/"; // または "error" ページなど
			}
			
			m.addAttribute("detailRecipe", detailRecipe);
			return "detail";
		}
	}
}
