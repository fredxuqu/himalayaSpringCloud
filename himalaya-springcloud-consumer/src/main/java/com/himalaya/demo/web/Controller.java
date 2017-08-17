package com.himalaya.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
	
	@Autowired
	DiscoveryClient discoveryCient;
	
	@GetMapping("/user-instance")
	public List<ServiceInstance> showInfo(){
		return this.discoveryCient.getInstances("himalaya-springcloud-provider");
	}

	@GetMapping("/user/{id}")
	public UserDO findById(@PathVariable Long id) {
		
		return this.restTemplate.getForObject("http://localhost:8080/user/" + id, UserDO.class);
	}
	
	
}
