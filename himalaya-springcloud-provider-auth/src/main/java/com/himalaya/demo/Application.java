package com.himalaya.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.himalaya.demo.domain.base.BaseRepositoryFactoryBean;

@EnableJpaRepositories(basePackages = {"com.himalaya"},
	repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class
)
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		 
		SpringApplication.run(Application.class, args);
		
		LOGGER.debug("Debug log - Provider Application is running......");
		LOGGER.info("Provider Application is running......");
	}
}
