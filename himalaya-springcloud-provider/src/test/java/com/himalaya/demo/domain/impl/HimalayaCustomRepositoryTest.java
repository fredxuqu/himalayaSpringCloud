package com.himalaya.demo.domain.impl;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.demo.HimalayaProviderApplicationTest;
import com.himalaya.demo.domain.HimalayaBaseRepository;
import com.himalaya.demo.domain.entity.UserDO;

public class HimalayaCustomRepositoryTest  extends HimalayaProviderApplicationTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaCustomRepositoryTest.class);

	@Autowired
	HimalayaBaseRepository himalayaBaseRepository;
	
	@Test
	public void testGet() {
		UserDO user = himalayaBaseRepository.findOne(2l);
		
		LOGGER.info("Tested, user : " + user); 
	}
	
	@Test
	public void testFindByName() {
		UserDO user = himalayaBaseRepository.findByName("fred xu");
		
		LOGGER.info("Tested, user : " + user);
	}
	
	@Test
	public void testFindByUserName() {
		UserDO user = himalayaBaseRepository.findByUsername("eric");
		
		LOGGER.info("Tested, user : " + user);
	}
	
	@Test
	public void testFindBySQL() {
		List<Object[]> list = himalayaBaseRepository.findBySQL("select id, name from user where age > 10");
		
		LOGGER.info("Tested, list size : " + list.size());
		for (Object[] obs : list) {
			LOGGER.info("Tested, obs length : " + obs.length);
			UserDO user = new UserDO();
			user.setId(Long.parseLong(obs[0]+""));
			user.setName(String.valueOf(obs[1]));
			LOGGER.info("Tested, user : " + user);
		}
	}
	
	@Test
	public void testCount() {
		
		long count = himalayaBaseRepository.count();
		
		LOGGER.info("Tested, count : " + count);
	}
	
	@Test
	public void testCountSpac() {
		
//		long count = himalayaBaseRepository.count(spec);
//		
//		LOGGER.info("Tested, count : " + count);
	}
	
	@Test
	public void testCountBySQL() {
		
		long count = himalayaBaseRepository.countBySQL("select count(*) from user where age > 10");
		
		LOGGER.info("Tested, count : " + count);
	}
}
