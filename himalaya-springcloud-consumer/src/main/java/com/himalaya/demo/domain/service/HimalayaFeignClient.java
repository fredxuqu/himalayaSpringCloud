package com.himalaya.demo.domain.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.himalaya.demo.domain.UserDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月23日 上午9:11:48
* Description
*/
@FeignClient(name="himalaya-springcloud-provider")
public interface HimalayaFeignClient {
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.GET)
	public UserDO findById(@PathVariable("id") long id);
	
	@RequestMapping(value="/user/service", method = RequestMethod.GET)
	public String service();
}
