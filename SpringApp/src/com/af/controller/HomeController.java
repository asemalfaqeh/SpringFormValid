package com.af.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class HomeController {

	@RequestMapping("/")
	public String Home() {
		return "home";
	}
	
	
}
