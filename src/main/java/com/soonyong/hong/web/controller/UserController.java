package com.soonyong.hong.web.controller;

import com.soonyong.hong.web.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/login")
    public String showLoginPage (){
        return "user/login";
	}

	@GetMapping("/register")
	public String showRegisterPage () {
		return "user/register";
	}

	@PostMapping("/register")
	public String register(@RequestParam(name = "username") String userName, @RequestParam String password ) {
		userService.register(userName, password);

		return "index";
	}

	@GetMapping("/login/fail")
    public String showFailPage (){
        return "index";
	}

	@GetMapping("/user")
	public String user () {
		return "index";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/")
	public String base() {
		return "index";
	}
}