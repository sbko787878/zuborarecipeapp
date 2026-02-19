package com.example.zuborarecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zuborarecipeapp.service.RecipeService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class BaseController {

	//	Serviceを使うためのフィールド
	private final RecipeService recipeService;
	
	//	DI @Autowiredを1つなので省略しコンストラクタインジェクション実施 ※@RequiredArgsConstructorでLombokが自動生成
//	public BaseController(RecipeService recipeService) {
//		this.recipeService = recipeService;
//	}

	// --- 1. 初期表示 ---
    @GetMapping("/")
    public String showRecipeList(Model model, HttpSession session) {
        // レシピリストの取得
        if (session.getAttribute("allRecipeList") == null) {
            session.setAttribute("allRecipeList", recipeService.getAllRecipes());
        }
        // アイコンリストの取得
        if (session.getAttribute("allIconList") == null) {
            session.setAttribute("allIconList", recipeService.getAllIcons());
        }

        // 【ここが重要！】検索バー用の全アイコンを取得してModelに入れる
//        List<Icon> allIcons = recipeService.getAllIcons();
//        model.addAttribute("allIcons", allIcons); 

        return "base";
    }
}
