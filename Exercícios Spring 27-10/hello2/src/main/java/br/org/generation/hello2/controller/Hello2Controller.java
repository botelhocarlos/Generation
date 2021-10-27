package br.org.generation.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class Hello2Controller {
	
	@GetMapping
	public String helloShow() {
		return "vou aprimorar ainda mais a atenção aos detalhes";
	}

}
