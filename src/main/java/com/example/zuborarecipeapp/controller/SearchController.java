package com.example.zuborarecipeapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.zuborarecipeapp.entity.Recipe;
import com.example.zuborarecipeapp.service.RecipeService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/search")
public class SearchController {
	//	Serviceを使うためのフィールド
	private final RecipeService recipeService;

	@GetMapping
	public String searchRecipes(
			@RequestParam("category") String category,
			@RequestParam(value = "iconName", required = false) String iconName, // 必須にしない
			HttpSession session) {

		List<Recipe> filteredList;
		if (iconName != null && !iconName.isEmpty()) {
			// 両方ある場合は複合検索
			filteredList = recipeService.searchByFilter(category, iconName);
		} else {
			// カテゴリーのみの場合は既存のカテゴリ検索
			filteredList = recipeService.findByCategory(category);
		}

		session.setAttribute("recipeList", filteredList);
		return "base";
	}
}
