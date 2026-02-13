package com.example.zuborarecipeapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.zuborarecipeapp.entity.Recipe;
import com.example.zuborarecipeapp.repository.RecipeMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

	private final RecipeMapper recipeMapper;

	@Override
	public List<Recipe> getAllRecipes() {

		List<Recipe> recipeList=recipeMapper.getAllRecipes();
		// 取得した全データに対して加工を行う
        for (Recipe recipe : recipeList) {
            // 1. スペースを<br>に変換して上書き
//        	breakBySpace(recipe);
            // 2. iconPath(文字列)をiconList(List)に変換
            setupIconList(recipe);
        }
		return recipeList;
		
	}

	@Override
	public Recipe findRecipeById(int id) {
		Recipe recipe=recipeMapper.findRecipeById(id);
		if (recipe != null) {
			//DB側で改行するよう改善中
//			breakBySpace(recipe);
			setupIconList(recipe);
		}
		return recipe;
	}
	
	@Override
	public List<Recipe> findByCategory(String category) {
	    // 1. Mapperを使ってDBからカテゴリー一致するものを取得
	    List<Recipe> recipeList = recipeMapper.findByCategory(category);
	    
	    // 2. アイコンを表示できるようにリスト化処理を通す
	    for (Recipe recipe : recipeList) {
	        setupIconList(recipe);
	    }
	    return recipeList;
	}
	
	// 3. 内部処理（Private）
    // DB側で改行改善中
    private void breakBySpace(Recipe recipe) {
        recipe.setName(((recipe.getName()).replace(" ", "<br>")));
    }

    private void setupIconList(Recipe recipe) {
    	if (recipe.getIconPath() != null && !recipe.getIconPath().isEmpty()) {
            recipe.setIconList(Arrays.asList(recipe.getIconPath().split(",")));
        } else {
            recipe.setIconList(new java.util.ArrayList<>());
        }
    }

	
}
