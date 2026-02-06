package com.example.zuborarecipeapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.zuborarecipeapp.entity.Recipe;

@Mapper
public interface RecipeMapper {
	List<Recipe> getAllRecipes();
}
