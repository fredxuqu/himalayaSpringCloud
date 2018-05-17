package com.himalaya.demo.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.demo.ApplicationTest;
import com.himalaya.demo.domain.TagsDO;
import com.himalaya.demo.service.HimalayaService;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年5月16日 下午2:57:27
* Description
*/
public class HimalayaServiceImplTest extends ApplicationTest {

	@Autowired
	HimalayaService himalayaService;
	
	@Test
	public void testGetById(){
		
		String result = himalayaService.findById(12);
		LOGGER.info(result);
	}
}
