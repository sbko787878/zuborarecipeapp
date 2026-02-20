package com.example.zuborarecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.zuborarecipeapp.form.LoginForm;
import com.example.zuborarecipeapp.repository.UserMapper;

@Controller
public class LoginController {

    private final UserMapper userMapper;

    public LoginController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(LoginForm form, Model model) {
        if (userMapper.findUser(form) > 0) {
            return "redirect:/home"; // ログイン成功
        } else {
            model.addAttribute("error", "IDまたはパスワードが違います");
            return "login"; // ログイン失敗
        }
    }
}