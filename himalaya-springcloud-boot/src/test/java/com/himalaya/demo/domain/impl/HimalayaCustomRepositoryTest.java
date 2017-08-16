package com.himalaya.demo.domain.impl;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.demo.HimalayaDemoApplicationTest;
import com.himalaya.demo.domain.HimalayaBaseRepository;
import com.himalaya.demo.domain.entity.UserDO;

public class HimalayaCustomRepositoryTest  extends HimalayaDemoApplicationTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaCustomRepositoryTest.class);

	@Autowired
	HimalayaBaseRepository himalayaCustomRepositoryTest;
	
	@Test
	public void testGet() {
		UserDO user = himalayaCustomRepositoryTest.findOne(2l);
		
		LOGGER.info("Tested, username : " + user.getUsername());
	}
	
	@Test
	public void testListBySQL() {
		List<Object[]> list = himalayaCustomRepositoryTest.listBySQL("select * from UserDO");
		
		LOGGER.info("Tested, list size" + list.size());
	}
}
