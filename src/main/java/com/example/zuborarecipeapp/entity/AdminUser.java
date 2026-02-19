package com.example.zuborarecipeapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class AdminUser {
	    private Integer id;
	    private String username;
	    private String password;
	}

