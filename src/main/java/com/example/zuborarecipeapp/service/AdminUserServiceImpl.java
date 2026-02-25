package com.example.zuborarecipeapp.service;

import org.springframework.stereotype.Service;

import com.example.zuborarecipeapp.entity.AdminUser;
import com.example.zuborarecipeapp.repository.AdminUserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminUserServiceImpl implements AdminUserService {
	private final AdminUserMapper mapper;
	
	@Override
	public AdminUser search(String name,String pass) {
		return mapper.findByUsername(name, pass);
	}
}
