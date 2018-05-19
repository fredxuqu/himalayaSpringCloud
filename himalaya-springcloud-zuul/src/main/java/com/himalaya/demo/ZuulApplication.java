package com.himalaya.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ZuulApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(ZuulApplication.class, args);

		LOGGER.info("Zuul Proxy Application is running......");
	}
}
