package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@Value("${application.controller.mensaje}")
	private String mensaje;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", "Spring Boot");
		model.addAttribute("mensaje", mensaje);
		return "index";
	}

}
