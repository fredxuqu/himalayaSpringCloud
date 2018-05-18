package com.himalaya.demo.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.demo.ApplicationTest;
import com.himalaya.demo.domain.TagsDO;
import com.himalaya.demo.service.HimalayaFeignClient;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年5月16日 下午5:17:23
* Description
*/
public class HimalayaFeignClientTest extends ApplicationTest {

	@Autowired
	public HimalayaFeignClient feignClient;
	
	@Test
	public void testGetById(){
		String result = feignClient.findById(1001);
		LOGGER.info("======" + result);
	}
	
	@Test
	public void testGetByTag(){
		TagsDO tagDO = new TagsDO();
		tagDO.setId(1000);
		tagDO.setTagName("POST");
		String result = feignClient.findByTag(tagDO);
		LOGGER.info("======" + result);
	}
}
