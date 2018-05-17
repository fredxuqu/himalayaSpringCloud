package com.himalaya.demo.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.demo.HimalayaProviderApplicationTest;


/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年5月16日 上午10:48:03
* Description
*/
public class HimalayaServiceImplTest extends HimalayaProviderApplicationTest{

	@Autowired
	HimalayaServiceImpl service;
	
	@Test
	public void service(){
		
		LOGGER.info("service test");
		Assert.assertEquals("succ", service.service());
	}
}
