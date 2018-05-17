package com.himalaya.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.himalaya.demo.service.HimalayaService;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月18日 上午11:20:30
* Description
*/
@Service
public class HimalayaServiceImpl implements HimalayaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaServiceImpl.class);
	
	@Autowired
	RestTemplate restTemplate;
		
	@Override
	public String findById(long id) {
		
		//String result = this.restTemplate.getForObject("http://localhost:8080/provider/get/" + id, String.class);
		
		String ribbonResult = this.restTemplate.getForObject("http://HIMALAYA-SPRINGCLOUD-PROVIDER/provider/get/" + id, String.class);
		
		return ribbonResult;
	}

	@Override
	public String service() {
		return "succ";
	}
}
