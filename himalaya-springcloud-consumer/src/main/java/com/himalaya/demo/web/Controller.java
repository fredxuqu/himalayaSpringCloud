package com.himalaya.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.demo.domain.UserDO;
import com.himalaya.demo.domain.service.DiscoveryService;
import com.himalaya.demo.domain.service.HimalayaService;

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
	HimalayaService himalayaService;
	
	@Autowired
	DiscoveryService discoveryService;
	
	@GetMapping("/instances")
	public List<ServiceInstance> getServiceInstances(){
		return this.discoveryService.getServiceInstances();
	}
	
	@GetMapping("/instance")
	public ServiceInstance getServiceInstance(){
		return this.discoveryService.getServiceInstance();
	}

	@GetMapping("/user/{id}")
	public UserDO findById(@PathVariable Long id) {
		
		return this.himalayaService.findById(id);
	}
	
	
}
