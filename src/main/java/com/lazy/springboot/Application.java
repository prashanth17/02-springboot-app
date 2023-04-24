package com.lazy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
private static final String REST_URL = "www.google.com";

    public static void main(String[] args) {
		//main class runs from here
        SpringApplication.run(Application.class, args);
    }

}
