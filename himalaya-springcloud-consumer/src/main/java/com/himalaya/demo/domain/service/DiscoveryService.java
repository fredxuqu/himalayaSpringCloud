package com.himalaya.demo.domain.service;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月18日 上午11:24:03
* Description
*/
public interface DiscoveryService {
	
	List<ServiceInstance> getServiceInstances();
	
	ServiceInstance getServiceInstance();
}
