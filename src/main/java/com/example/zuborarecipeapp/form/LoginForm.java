package com.example.zuborarecipeapp.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginForm {

    @NotBlank(message = "ユーザー名を入力してください")
    @Size(min = 4, max = 20, message = "ユーザー名は4文字以上20文字以内で入力してください")
    private String username;

    @NotBlank(message = "パスワードを入力してください")
    @Size(min = 8, message = "パスワードは8文字以上で入力してください")
    private String password;

}