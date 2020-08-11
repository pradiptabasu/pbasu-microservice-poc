package com.example.pradipta.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingsController {
	
	//@Value("${generic.greetings: Default Greetings}")	
	@Value("${generic.greetings: Default Greetings}")
	private String greetingsMessage;
	
	public GreetingsController() {
	}
	
	@GetMapping("/greet/{name}")
    public String greet(@PathVariable("name") String name) {
	    return "Hi " + name + "  " + greetingsMessage;
    }
}
