package com.pradipta.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsMsg {
	
	@Value("${generic.greetings: Default Greetings}")
	private String greetingsMessage;
	
	public GreetingsMsg()
	{
		
	}
	
	@GetMapping("/greet/{name}")
	public String greetings(@PathVariable("name") String name)
	{
		return greetingsMessage + " " + name;
	}
	
	@GetMapping("/currentHostname")
	public String currentHost() {
		InetAddress ip;
		String hostname = "";
		try {
			ip = InetAddress.getLocalHost();
			hostname = ip.getHostName();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return greetingsMessage + " routed via host -->> " + hostname;
	}

}
