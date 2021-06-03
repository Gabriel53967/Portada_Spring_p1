package com.dwa.p1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	
	@GetMapping("/Demo/Portada")
	//@GetMapping(path = {"/vistas/Portada", "/"})
	public String Portada() {
		return "Demo/Portada";
	}

}
