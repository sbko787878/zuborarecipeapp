package com.example.zuborarecipeapp.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.zuborarecipeapp.form.LoginForm;

@Mapper
public interface UserMapper {
    // IDとパスワードが一致するユーザー数をカウント
    @Select("SELECT COUNT(*) FROM users WHERE user_id = #{userId} AND password = #{password}")
    int findUser(LoginForm form);
}