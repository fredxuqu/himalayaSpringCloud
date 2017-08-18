package com.himalaya.demo.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.himalaya.demo.domain.UserDO;
import com.himalaya.demo.domain.service.HimalayaService;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月18日 上午11:20:30
* Description
*/
@Service
public class HimalayaServiceImpl implements HimalayaService {

	@Autowired
	RestTemplate restTemplate;
	
	public UserDO findById(@PathVariable Long id) {
		
		return this.restTemplate.getForObject("http://localhost:8080/user/" + id, UserDO.class);
	}
	
	@Override
	public UserDO findById(long id) {
		// no balanced access
		// return this.restTemplate.getForObject("http://localhost:8080/user/" + id, UserDO.class);
		
		// balanced access
		return this.restTemplate.getForObject("http://himalaya-springcloud-provider/user/" + id, UserDO.class);
	}

	@Override
	public String service() {
		// balanced access
		return this.restTemplate.getForObject("http://himalaya-springcloud-provider/user/service", String.class);
	}
}
