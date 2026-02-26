package com.example.zuborarecipeapp.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.zuborarecipeapp.entity.AdminUser;
import com.example.zuborarecipeapp.repository.AdminUserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminUserDetailsService implements UserDetailsService {

	private final AdminUserMapper mapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 1. DBからユーザーを探す
		AdminUser admin = mapper.findByName(username);

		// 2. 見つからなければエラーを投げる
		if (admin == null) {
			throw new UsernameNotFoundException("ユーザー名が見つかりません: " + username);
		}
		UserDetails u=User.withUsername(admin.getName())
		.password(admin.getPass())
		.roles("ADMIN") // 権限を「ADMIN」として設定
		.build();
		System.out.println(u);
		// 3. Spring Security専用のユーザー型（UserDetails）に変換して返す
		return User.withUsername(admin.getName())
		        .password(admin.getPass()) // DBに保存されているハッシュ化済みのパスワードを渡す
		        .roles("ADMIN")
		        .build();
	}
}