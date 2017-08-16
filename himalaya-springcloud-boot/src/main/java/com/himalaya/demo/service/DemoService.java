package com.himalaya.demo.service;

import com.himalaya.demo.model.UserDO;

public interface DemoService {
	
	public String service();
	public UserDO getUserById(Long id);
}
