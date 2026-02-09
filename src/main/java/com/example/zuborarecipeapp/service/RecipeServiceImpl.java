package com.example.zuborarecipeapp.service;

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

		return recipeMapper.getAllRecipes();
	}

	@Override
	public Recipe findRecipeById(int id) {
		return recipeMapper.findRecipeById(id);
	}
}
