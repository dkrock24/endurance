package org.endurance.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeControlller {
	
	@RequestMapping("home")
	public String demo(Model model) {
		
	
		return "admin/home";
	}
}
