package com.himalaya.demo.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.demo.domain.UserDO;
import com.himalaya.demo.domain.service.DiscoveryService;
import com.himalaya.demo.domain.service.HimalayaService;
import com.himalaya.demo.domain.service.impl.HimalayaServiceFeignImpl;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月17日 下午2:54:50
* Description
*/
@RestController
public class Controller {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	HimalayaService himalayaService;
	
	@Autowired
	DiscoveryService discoveryService;
	
	@Autowired
	@Qualifier(value="himalayaServiceFeign")
	HimalayaServiceFeignImpl himalayaServiceFeign;
	
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
	
	/** feign client config
	 * 	modify consumer side by below steps:
	 *  	add dependancy spring-cloud-starter-feign to pom.xml
	 *  	add HimalayaFeignClient 
	 *  	add @EnableFeignClients to Application class
	 * @param id
	 * @return
	 */
	@GetMapping("/user/feign/{id}")
	public UserDO findByIdFeign(@PathVariable Long id) {
		LOGGER.info("Feign Client findByIdFeign()");
		return this.himalayaServiceFeign.findById(id);
	}
	
	@GetMapping("/user/feign/service")
	public String serviceFeign() {
		LOGGER.info("Feign Client serviceFeign()");
		return this.himalayaServiceFeign.service();
	}
}
