package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
		System.out.println("welcome to Spring");
		disp();
	}
	public static void disp() {
		System.out.println("welcome");
	}

}
