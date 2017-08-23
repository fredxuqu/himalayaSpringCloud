package com.himalaya.demo.domain.impl;

import java.math.BigDecimal;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.demo.HimalayaProviderApplicationTest;
import com.himalaya.demo.domain.HimalayaRepositoryCustom;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午3:23:46
* Description
*/
public class HimalayaRepositoryCustomImplTest extends HimalayaProviderApplicationTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaRepositoryCustomImplTest.class);

	@Autowired
	HimalayaRepositoryCustom himalayaRepositoryCustom;
	
	@Test
	public void testCount() {
		int result = himalayaRepositoryCustom.count();
		
		LOGGER.info("Tested, count: " + result);
	}
	
	@Test
	public void testCountBalance() {
		BigDecimal result = himalayaRepositoryCustom.countBalance();
		
		LOGGER.info("Tested, total balance : " + result);
	}
}
