package com.example.zuborarecipeapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.zuborarecipeapp.entity.Icon;
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

	@GetMapping("/search")
    public String search(
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "iconNames", required = false) List<String> iconNames,
            Model model,
            HttpSession session) {

        // 検索実行
        List<Recipe> filteredList = recipeService.searchByFilter(category, iconNames);
        session.setAttribute("recipeList", filteredList);

        // 【ここも重要！】再表示の際にもアイコンリストをModelに入れないと消えてしまう
        List<Icon> allIcons = recipeService.getAllIcons();
        model.addAttribute("allIcons", allIcons);

        return "base";
    }
}
