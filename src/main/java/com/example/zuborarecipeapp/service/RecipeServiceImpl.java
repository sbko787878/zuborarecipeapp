package com.example.zuborarecipeapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.zuborarecipeapp.entity.Icon;
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
		return recipeList;
	}

	@Override
	public Recipe findRecipeById(int id) {
		Recipe recipe=recipeMapper.findRecipeById(id);
		return recipe;
	}
	
	@Override
	public List<Recipe> findByCategory(String category) {
	    List<Recipe> recipeList = recipeMapper.findByCategory(category);
	    return recipeList;
	}
	
	@Override
	public List<Recipe> searchByFilter(String category, List<String> iconName) {
	    return recipeMapper.searchByFilter(category, iconName);
	}
	
	@Override
	public List<Icon> getAllIcons() {
	    return recipeMapper.getAllIcons();
	}
}