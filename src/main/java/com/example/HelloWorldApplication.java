package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("This is sample SpringBoot Project for testing purpose...");
	}
	
	@GetMapping("/test")
	public String show(){
		return "Hi Laxmi!"+"<br>"
				+"Tausif is showing you his first SpringBoot Project deployed on AWS successfully...!";


		}

}
