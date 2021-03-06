package com.himalaya.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class) 
public class HimalayaProviderApplicationTest {

	protected static final Logger LOGGER = LoggerFactory.getLogger(HimalayaProviderApplicationTest.class);
	
	@Test
	public void test(){
		LOGGER.info("testing...");
	}
}
