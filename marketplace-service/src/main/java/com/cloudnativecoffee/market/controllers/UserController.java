package com.cloudnativecoffee.market.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		return "profile";
	}

}
