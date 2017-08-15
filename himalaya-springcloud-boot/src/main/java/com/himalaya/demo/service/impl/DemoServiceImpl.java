package com.himalaya.demo.service.impl;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.himalaya.demo.model.UserDO;
import com.himalaya.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);
	
	@Override
	public String service() {
		
		LOGGER.info("call service ");
		return "succ";
	}

	@Override
	public UserDO getUserById(Long id) {
		UserDO user = new UserDO();
		user.setId(2l);
		user.setUsername("Fred");
		user.setName("Fred Xu");
		user.setAge(32);
		user.setBalance(new BigDecimal("12.2"));
		
		return user;
	}

}
