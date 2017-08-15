package com.himalaya.demo;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HimalayaSpringBootApplication.class) 
public class HimalayaDemoApplicationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaDemoApplicationTest.class);

}
