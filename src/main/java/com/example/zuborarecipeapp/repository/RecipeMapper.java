package com.example.zuborarecipeapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.zuborarecipeapp.entity.Recipe;

@Mapper
public interface RecipeMapper {
	List<Recipe> getAllRecipes();

	Recipe findRecipeById(int id);
	
	List<Recipe> findByCategory(String category);
	
	List<Recipe> searchByFilter(@Param("category") String category, @Param("iconName") String iconName);
}
