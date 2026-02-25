package com.example.zuborarecipeapp.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.zuborarecipeapp.entity.AdminUser;

@Mapper
public interface AdminUserMapper {
	AdminUser findByUsername(String username, String pass);

	// パスワードなし、名前だけで検索するメソッドを追加（または修正）
	AdminUser findByName(String name);
}