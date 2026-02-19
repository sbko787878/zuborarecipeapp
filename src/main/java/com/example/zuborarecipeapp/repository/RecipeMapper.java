package com.example.zuborarecipeapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.zuborarecipeapp.entity.Icon;
import com.example.zuborarecipeapp.entity.Recipe;

@Mapper
public interface RecipeMapper {
	List<Recipe> getAllRecipes();

	Recipe findRecipeById(int id);
	
	List<Recipe> findByCategory(String category);
	
	List<Recipe> searchByFilter(@Param("category") String category, @Param("iconName") List<String> iconName);
	
	List<Icon> getAllIcons();
	
//	管理者ページ用のメソッド
  
    // 新規登録
    void insert(Recipe recipe);
    // 更新
    void update(Recipe recipe);
    // 削除
    void delete(int id);
}
