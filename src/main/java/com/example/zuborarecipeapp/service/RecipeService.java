package com.example.zuborarecipeapp.service;

import java.util.List;

import com.example.zuborarecipeapp.entity.Icon;
import com.example.zuborarecipeapp.entity.Recipe;

public interface RecipeService {
	List<Recipe> getAllRecipes();

	Recipe findRecipeById(int id);
	
	List<Recipe> findByCategory(String category);
	
	List<Recipe> searchByFilter(String category, List<String> iconName);
	
	List<Icon> getAllIcons();
	
//	void insertRecipe(Recipe recipe);
//	
//	void updateRecipe(Recipe recipe);
//	
//	void deleteRecipe(int id);

}
