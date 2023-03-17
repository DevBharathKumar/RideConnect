package com.bb.RideConnect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstTestController {

	@GetMapping("/hello")
	public String getMessage()
	{
		return "Hello world";
	}
	
}
