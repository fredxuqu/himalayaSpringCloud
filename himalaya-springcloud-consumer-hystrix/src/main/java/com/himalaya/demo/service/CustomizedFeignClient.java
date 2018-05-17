package com.himalaya.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.himalaya.demo.config.FeignConfiguration;

import feign.Param;
import feign.RequestLine;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年5月16日 下午4:35:32 Description
 */
//@FeignClient(name = "HIMALAYA-SPRINGCLOUD-PROVIDER", configuration = FeignConfiguration.class)
public interface CustomizedFeignClient {
	/**
	 * 使用feign自带的注解@RequestLine
	 * 
	 * @see https://github.com/OpenFeign/feign
	 * @param id Tag id
	 * @return String
	 */
	@RequestLine("GET /provider/get/{id}")
	public String findById(@Param("id") Long id);
}
