package com.himalaya.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.demo.domain.TagsDO;
import com.himalaya.demo.service.HimalayaFeignClient;
//import com.himalaya.demo.service.HimalayaFeignClient;
import com.himalaya.demo.service.HimalayaService;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年8月17日 下午2:54:50 Description
 */
@RestController
public class Controller {

	private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

	@Autowired
	LoadBalancerClient loadBalancerClient;

	@Autowired
	HimalayaService himalayaService;
	
	@Autowired
	HimalayaFeignClient feignClient;
	
//	@Autowired
//	CustomizedFeignClient customizedFeignClient;

	@GetMapping("/get/{id}")
	public String findById(@PathVariable Long id) {
		LOGGER.info("Get By Id " + id);
		return this.himalayaService.findById(id);
	}
	
	/**
	 * 使用feign 生成Rest调用
	 * @param id
	 * @return
	 */
	@GetMapping("/get/feign/{id}")
	public String findByIdFeign(@PathVariable Long id) {
		LOGGER.info("Feign: Get By Id " + id);
		return this.feignClient.findById(id);
	}
	
	/**
	 * 使用feign 生成Rest调用
	 * @param id
	 * @return
	 */
	@GetMapping("/post/feign")
	public String postByIdFeign() {
		LOGGER.info("Feign: POST");
		TagsDO tagDO = new TagsDO();
		tagDO.setId(1001);
		tagDO.setTagName("FEIGN POST");
		String result = this.feignClient.findByTag(tagDO);
		LOGGER.info("Feign: POST Result=" + result);
		return result;
	}

//	/**
//	 * 测试自定义Feign
//	 * @param id
//	 * @return
//	 */
//	@GetMapping("/get/custfeign/{id}")
//	public String findByIdCustFeign(@PathVariable Long id) {
//		LOGGER.info("Feign: Customized Get By Id " + id);
//		return this.customizedFeignClient.findById(id);
//	}
	
	@GetMapping("/service")
	public String service() {
		LOGGER.info("service");
		return this.himalayaService.service();
	}

	@GetMapping("/log-tag-instance")
	public void logUserInstance() {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("HIMALAYA-SPRINGCLOUD-PROVIDER");
		// 打印当前选择的是哪个节点
		LOGGER.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(),
				serviceInstance.getPort());
	}
}
