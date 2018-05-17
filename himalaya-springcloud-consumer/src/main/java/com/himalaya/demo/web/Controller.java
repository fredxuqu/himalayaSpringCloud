package com.himalaya.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.demo.service.HimalayaService;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年8月17日 下午2:54:50 Description
 */
@RestController
public class Controller {

	private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

	@Autowired
	HimalayaService himalayaService;

	@GetMapping("/get/{id}")
	public String findById(@PathVariable Long id) {
		LOGGER.info("find By Id " + id);
		return this.himalayaService.findById(id);
	}

	@GetMapping("/service")
	public String service() {
		LOGGER.info("service");
		return this.himalayaService.service();
	}
	
	@GetMapping("/")
	public String connection() {
		return "consumer is running...";
	}
}
