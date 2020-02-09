package com.soonyong.hong.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class Login {

	@GetMapping("")
    public String showLoginPage (){
        return "index";
    }
	
	@PostMapping("")
	public String login () {
		return "index";
	}
}