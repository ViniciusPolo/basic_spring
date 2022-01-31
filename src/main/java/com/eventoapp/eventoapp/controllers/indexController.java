package com.eventoapp.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //criado a notação Controller / Ctrl+shift + o para importa-la
public class indexController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
