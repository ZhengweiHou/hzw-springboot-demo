package com.houzw.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		System.out.println("hello word123");
		SpringApplication.run(AppApplication.class, args);
	}

}
