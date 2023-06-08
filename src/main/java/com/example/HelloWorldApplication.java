package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("This is sample SpringBoot Project for testing purpose...");
	}
	
	@GetMapping("/test")
	public String show(){
		return "Hello!, Your first SpringBoot Project is deployed successfully...!"

		}
}
