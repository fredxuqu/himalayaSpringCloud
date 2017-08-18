package com.himalaya.demo.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

import com.himalaya.demo.domain.service.DiscoveryService;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月18日 上午11:24:45
* Description
*/
@Service
public class DiscoveryServiceImpl implements DiscoveryService {

	@Autowired
	DiscoveryClient discoveryCient;
	
	@Autowired
	LoadBalancerClient loadBalancerClient;
	
	/**
	 * list all service instance.
	 */
	@Override
	public List<ServiceInstance> getServiceInstances() {
		return this.discoveryCient.getInstances("himalaya-springcloud-provider");
	}

	/**
	 * choose a service instance from service list.
	 */
	@Override
	public ServiceInstance getServiceInstance() {
		return this.loadBalancerClient.choose("himalaya-springcloud-provider");
	}
}
