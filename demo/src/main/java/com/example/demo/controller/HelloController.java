package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/pythonbetter")
	public String helloString(){
		return "PYTHON BETTER!";

	}

}