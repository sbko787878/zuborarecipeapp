package com.example.zuborarecipeapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginController {
//	private final AdminUserService service;

//    @PostMapping("/login")
//    public String login(
//    		@RequestParam String name,
//    		@RequestParam String pass,
//    		HttpSession session) {
//    	AdminUser adminUser = service.search(name, pass);
//    	if(adminUser == null) {
//    		return "redirect:/login?error";
//    	}
//    	
//    	// セッションにログインユーザー情報を保存
//        // "loginUser" という名前（キー）で保存します
//        session.setAttribute("adminUser", adminUser);
//    	
//        return "redirect:/admin/recipes"; // 直接表示ではなく、メニューへリダイレクトするのが一般的
//    }
//
    @GetMapping("/login")
    public String loginComp() {
        return "login"; // loginComp.html を表示
    }
}