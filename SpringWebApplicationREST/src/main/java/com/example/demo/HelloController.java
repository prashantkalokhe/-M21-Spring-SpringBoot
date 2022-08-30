package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component

//Using this annotation request will pass to the server and will get the response
@RestController
public class HelloController 
{
	@RequestMapping("/M21")
	public String print()
	{
		return "Welcome to M21 Batch 30 Aug 2022";
	}

}