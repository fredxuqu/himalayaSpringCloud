package com.himalaya.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.demo.domain.entity.UserDO;
import com.himalaya.demo.service.HimalayaService;

@RestController
public class DemoController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	HimalayaService himalayaService;
	
	@GetMapping("/{id}")
	public UserDO getUserById(@PathVariable Long id){
		
		LOGGER.info("getUserById called....");
		return this.himalayaService.getUserById(id);
	}
	
	@GetMapping("/service")
	public String service(){
		
		LOGGER.info("service called....");
		return this.himalayaService.service();
	}
}
