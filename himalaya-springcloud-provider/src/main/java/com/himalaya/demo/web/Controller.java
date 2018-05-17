package com.himalaya.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.demo.domain.TagsDO;
import com.himalaya.demo.service.HimalayaService;

@RestController
public class Controller {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	HimalayaService himalayaService;
	
	@PostMapping("/post")
	public String getTagsByTag(@RequestBody TagsDO tagDO){
		
		LOGGER.info("POST tags by id [{}], name [{}] called....", tagDO.getId(), tagDO.getTagName());
		TagsDO tag = this.himalayaService.query(tagDO.getId());
		LOGGER.info("Tags Info : " + tag.toString());
		try {
			Thread.sleep(tagDO.getId());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tag.toString();
	}
	
	@GetMapping("/get/{id}")
	public String getUserById(@PathVariable Long id) throws Exception{
		
		LOGGER.info("get tags by id [{}] called....", id);
		TagsDO tag = this.himalayaService.query(id);
		LOGGER.info("Tags Info : " + tag.toString());
		if(id==100){
			throw new Exception("id already exists");
		}
		try {
			Thread.sleep(id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tag.toString();
	}
	
	@GetMapping("/service")
	public String service(){
		
		LOGGER.info("service called....");
		return this.himalayaService.service();
	}
}
