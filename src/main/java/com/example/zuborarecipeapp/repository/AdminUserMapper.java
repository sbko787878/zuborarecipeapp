package com.example.zuborarecipeapp.repository;


import org.apache.ibatis.annotations.Mapper;

import com.example.zuborarecipeapp.entity.AdminUser;

@Mapper
public interface AdminUserMapper {
    AdminUser findByUsername(String username,String pass);
}