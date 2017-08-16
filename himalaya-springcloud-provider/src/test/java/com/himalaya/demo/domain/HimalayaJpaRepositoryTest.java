package com.himalaya.demo.domain;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.demo.HimalayaProviderApplicationTest;
import com.himalaya.demo.domain.entity.UserDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午3:23:46
* Description
*/
public class HimalayaJpaRepositoryTest extends HimalayaProviderApplicationTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaJpaRepositoryTest.class);

//	@Autowired
//	HimalayaRepository himalayaRepository;
//	
//	@Test
//	public void testGetById() {
//		UserDO user = himalayaRepository.findOne(2l);
//		
//		LOGGER.info("Tested, username " + user.getUsername());
//	}
}
