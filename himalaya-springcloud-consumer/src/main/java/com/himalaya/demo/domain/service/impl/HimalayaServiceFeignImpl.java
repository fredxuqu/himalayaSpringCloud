package com.himalaya.demo.domain.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.himalaya.demo.Application;
import com.himalaya.demo.domain.UserDO;
import com.himalaya.demo.domain.service.HimalayaFeignClient;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月18日 上午11:20:30
* Description
*/
@Service("himalayaServiceFeign")
public class HimalayaServiceFeignImpl {

	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaServiceFeignImpl.class);
	
	@Autowired
	private HimalayaFeignClient feignClient;
	
	public UserDO findById(@PathVariable Long id) {
		
		LOGGER.info("Feign Client findById()");
		return this.feignClient.findById(id);
	}
	
	public String service() {
		
		LOGGER.info("Feign Client service()");
		return this.feignClient.service();
	}
}
