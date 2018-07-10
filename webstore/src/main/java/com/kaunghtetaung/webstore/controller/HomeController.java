package com.kaunghtetaung.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/welcome")
	private String welcome(Model model) {
		
		model.addAttribute("greeting", "Welcome to webstore!");
		model.addAttribute("tagline", "The only & one amazing webstore.");
		
		return "welcome";

	}

}
