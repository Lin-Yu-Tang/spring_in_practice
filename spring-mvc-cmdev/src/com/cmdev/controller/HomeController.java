package com.cmdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmdev.entity.User;
import com.cmdev.service.UserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCrypt;


@Controller
@RequestMapping("/")
public class HomeController {
	
	private UserService userService;
	
	public HomeController(UserService service) {
		this.userService = service;
	}
	
	/**
	 * 首頁
	 */
	@GetMapping("")
	public String home(HttpSession session) {
		Object user = session.getAttribute("username");
		String url = "index";
		
		if (user != null)
			url = "redirect:employee-manage";
			
		
		
		return url;
	}
	
	/**
	 * 使用者登入驗證
	 */
	@PostMapping("/userLogin")
	public String userlogin(
			@RequestParam(name = "userAccount") String account,
			@RequestParam(name = "userPassword") String password,
			@RequestParam(name = "autoLogin", required = false) String autoLogin,
			HttpSession session,
			HttpServletResponse response) {
		String url = "index";
		User user = userService.getUserByAccount(account);
		
		System.out.println("auto: " + autoLogin);
		
		boolean checkpw = BCrypt.checkpw(password, user.getPassword());
		
		if (checkpw) {
			
			session.setAttribute("username", account.toLowerCase());
			session.setMaxInactiveInterval(180 * 24 * 60 * 60);
			
			if ("true".equals(autoLogin)) {
				
				
				Cookie c = new Cookie("AL",
						BCrypt.hashpw(account.toLowerCase(), BCrypt.gensalt(9)));
				c.setMaxAge(180 * 24 * 60 * 60);
				response.addCookie(c);
				
			}
			
			url = "redirect:employee-manage";
		}else {

			
		}
		
		return url;
	}
	
	/**
	 * 註冊表單
	 */
	@GetMapping("/register")
	public String register() {
		
		return "register-form";
	}
	
	/**
	 * 使用者送出表單
	 */
	@PostMapping("/processForm")
	public String saveUser(
					@RequestParam(name = "account") String account,
					@RequestParam(name = "password") String password,
					@RequestParam(name = "userName") String username) {
		
		String encryptPass = BCrypt.hashpw(password, BCrypt.gensalt(10));
		
		User user = new User(username, account, encryptPass);
		
		userService.saveUser(user);
		
		return "index";
	}
	
	
	
	
	
	
	
	
}
