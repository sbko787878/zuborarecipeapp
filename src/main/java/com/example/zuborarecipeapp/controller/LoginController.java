package com.example.zuborarecipeapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.zuborarecipeapp.service.AdminUserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginController {
	private final AdminUserService service;

    @PostMapping("/login")
    public String login(
    		@RequestParam String name,
    		@RequestParam String pass) {
    	service.search(name,pass);
    	if(service.search(name,pass) == null) {
    		return "login";
    	}
        return "loginComp"; // login.html を表示
    }

    @GetMapping("/login")
    public String loginComp() {
        return "login"; // loginComp.html を表示
    }
}