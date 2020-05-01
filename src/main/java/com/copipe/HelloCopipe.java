package com.copipe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCopipe {
	@RequestMapping("/")
	public String Hello() {
		return "Hello Copy And Paster  World!";
	}
}
