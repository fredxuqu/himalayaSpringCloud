package com.himalaya.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年5月16日 下午4:35:57 Description
 */
//@Configuration
public class FeignConfiguration {

	/**
	 * 将契约改为feign原生的默认契约。这样就可以使用feign自带的注解了。
	 * 
	 * @return 默认的feign契约
	 */
	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}
}
