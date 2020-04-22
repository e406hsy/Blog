package com.soonyong.hong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class Login {
	@GetMapping("/login")
    public String showLoginPage (){
        return "index";
	}

	@GetMapping("/login/fail")
    public String showFailPage (){
        return "index";
	}

	@PostMapping("/login")
	public String login() {
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