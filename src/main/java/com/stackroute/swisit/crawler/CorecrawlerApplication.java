package com.stackroute.swisit.crawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorecrawlerApplication {

	public static void main(String[] args) {
		System.out.println("in main method");
		SpringApplication.run(CorecrawlerApplication.class, args);
	}
}
