package com.example.zuborarecipeapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zuborarecipeapp.entity.Recipe;
import com.example.zuborarecipeapp.service.RecipeService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
//@RequiredArgsController
public class BaseController {

	//	Serviceを使うためのフィールド
	private final RecipeService recipeService;

	//	DI @Autowiredを1つなので省略しコンストラクタインジェクション実施
	public BaseController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@GetMapping
	public String showRecipeList(HttpSession session) {
		// Service経由でSQL実行し、Listを取得
		List<Recipe> recipeList = recipeService.getAllRecipes();
		session.setAttribute("recipeList", recipeList);
		return "base";
	}
}
