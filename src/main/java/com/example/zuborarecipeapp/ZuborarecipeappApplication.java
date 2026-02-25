package com.example.zuborarecipeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.zuborarecipeapp.repository.AdminUserMapper;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ZuborarecipeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuborarecipeappApplication.class, args).getBean(
				ZuborarecipeappApplication.class).test();
	
	}
	private final AdminUserMapper mapper;
	
	public void test() {
		System.out.print(mapper.findByUsername("admin","111111"));
	}

}
