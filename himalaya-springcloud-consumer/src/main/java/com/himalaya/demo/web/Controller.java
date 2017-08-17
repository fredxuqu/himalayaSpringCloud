package com.himalaya.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.himalaya.demo.domain.UserDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月17日 下午2:54:50
* Description
*/
@RestController
public class Controller {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/user/{id}")
	public UserDO findById(@PathVariable Long id) {
		
		return this.restTemplate.getForObject("http://localhost:8080/provider/" + id, UserDO.class);
	}
}
