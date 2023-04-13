package com.erickcg.Taller1.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class PersonController {
	
	

		//retornando la pantalla principal del login
	@GetMapping("/")
	public String getLoging() {
		return "login";
		
	}
	
	@GetMapping("/failLog")
	public String getFailLog() {
		return "errorLog";
	}
	
	
}
