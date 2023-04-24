package com.lazy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
private Map<String,Object> cache = new HashMap<String,Object>(); 
    public static void main(String[] args) {
		//main class runs from here
        SpringApplication.run(Application.class, args);
    }


public void loadDataToCache(){
	//load the data add to the map
}
}
