package com.example.zuborarecipeapp.service;

import com.example.zuborarecipeapp.entity.AdminUser;

public interface AdminUserService {
	AdminUser search(String name,String pass);
}
