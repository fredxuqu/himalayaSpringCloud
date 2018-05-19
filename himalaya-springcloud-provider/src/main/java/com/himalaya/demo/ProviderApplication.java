package com.himalaya.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProviderApplication.class);

	public static void main(String[] args) {
		 
		SpringApplication.run(ProviderApplication.class, args);
		
		LOGGER.info("Provider Application is running......");
	}
}