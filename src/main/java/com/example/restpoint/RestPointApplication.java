package com.example.restpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class RestPointApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestPointApplication.class, args);
	}

	@RequestMapping("/test")
	@GetMapping
	public String get() {
		return "I'm running!";
	}

}
