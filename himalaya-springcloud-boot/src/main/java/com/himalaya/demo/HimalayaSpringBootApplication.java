package com.himalaya.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HimalayaSpringBootApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaSpringBootApplication.class);

	public static void main(String[] args) {
		 
		SpringApplication.run(HimalayaSpringBootApplication.class, args);
		
		LOGGER.info("HimalayaSpringBootApplication is running......");
	}
}
