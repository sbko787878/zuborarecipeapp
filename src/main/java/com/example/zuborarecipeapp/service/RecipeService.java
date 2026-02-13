package com.example.zuborarecipeapp.service;

import java.util.List;

import com.example.zuborarecipeapp.entity.Recipe;

public interface RecipeService {
	List<Recipe> getAllRecipes();

	Recipe findRecipeById(int id);

}
