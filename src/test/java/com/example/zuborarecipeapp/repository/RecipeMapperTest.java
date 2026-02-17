package com.example.zuborarecipeapp.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.zuborarecipeapp.entity.Recipe;

@SpringBootTest
@Transactional // テスト後にデータをさわってもロールバックされる
class RecipeMapperTest {

    @Autowired
    private RecipeMapper recipeMapper;

    @Test
    void findByCategoryShouldReturnRecipesWithIcons() {
        // 1. 実行（DBに存在するカテゴリ名を指定）
        List<Recipe> recipeList = recipeMapper.findByCategory("①");

        // 2. 検証
        assertThat(recipeList).isNotEmpty(); // レシピが取得できていること
        
        Recipe firstRecipe = recipeList.get(0);
        System.out.println("検証中のレシピ: " + firstRecipe.getName());

        // ★ここが最重要：iconListが正しくマッピングされているか
        assertThat(firstRecipe.getIconList()).isNotNull();
        
        // アイコンの中身をコンソールに出して目視確認
        firstRecipe.getIconList().forEach(icon -> {
            System.out.println("  - 取得されたアイコン: " + icon.getIconName() + " (" + icon.getIconPath() + ")");
        });
        
        // アイコンが1つ以上紐づいているレシピなら、ここがパスするはず
        // assertThat(firstRecipe.getIconList()).isNotEmpty();
    }
}