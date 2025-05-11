package com.phegondev.HotelPhegon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelPhegonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelPhegonApplication.class, args);
		System.out.println("Backend running at: http://localhost:8080");
	}

}
