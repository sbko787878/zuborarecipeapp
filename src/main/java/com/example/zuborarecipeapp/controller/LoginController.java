package com.example.zuborarecipeapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.zuborarecipeapp.service.AdminUserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginController {
	private final AdminUserService service;

    @GetMapping("/login")
    public String login(String name,String pass) {
    	service.search(name,pass);
    	if(service.search(name,pass) == null) {
    		return "login";
    	}
        return "loginComp"; // login.html を表示
    }

    @PostMapping("/login")
    public String loginComp() {
        return "loginComp"; // loginComp.html を表示
    }
}