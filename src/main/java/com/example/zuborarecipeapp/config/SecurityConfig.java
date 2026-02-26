package com.example.zuborarecipeapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

	private final UserDetailsService userDetailsService;

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
				.authorizeHttpRequests(auth -> auth
						.requestMatchers("/admin/**").authenticated() // /admin/以下のURLは要ログイン
						.anyRequest().permitAll() // それ以外（トップページなど）は誰でも見れる
				)
				.formLogin(login -> login
						.loginPage("/login") // 自作のログイン画面を使う
						.loginProcessingUrl("/login") // ログイン処理をするURL（POST /login をSecurityが乗っ取ります）
						.defaultSuccessUrl("/admin/recipes", true) // 成功したらここへ
						.failureUrl("/login?error") // 失敗したらここへ
						.usernameParameter("name") // HTMLの input name="name" に合わせる
						.passwordParameter("pass") // HTMLの input name="pass" に合わせる
						.permitAll())
				.logout(logout -> logout
						.logoutUrl("/logout") // ログアウトURL
						.logoutSuccessUrl("/login") // ログアウト後の移動先
						.invalidateHttpSession(true) // セッションを破棄
						.deleteCookies("JSESSIONID") // クッキーを消去
						.permitAll());

		return http.build();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}