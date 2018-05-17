package com.himalaya.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.himalaya.demo.domain.TagsDO;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年5月16日 下午4:13:08 Description
 */
//@FeignClient(name = "HIMALAYA-SPRINGCLOUD-PROVIDER", fallback = HimalayaFeignClientFallback.class)
@FeignClient(name = "HIMALAYA-SPRINGCLOUD-PROVIDER", fallbackFactory = HimalayaServiceFallbackFactory.class)
public interface HimalayaFeignClient {

	@RequestMapping(value = "/provider/get/{id}", method = RequestMethod.GET)
	String findById(@PathVariable("id") long id);

	@RequestMapping(value = "/provider/post", method = RequestMethod.POST)
	String findByTag(@RequestBody TagsDO tagDO);
}

@Component
class HimalayaFeignClientFallback implements HimalayaFeignClient {

	@Override
	public String findById(long id) {
		TagsDO tagDO = new TagsDO();
		tagDO.setId(id);
		tagDO.setTagName("Default TAG NAME");
		return tagDO.toString();
	}

	@Override
	public String findByTag(TagsDO tagDO) {
		TagsDO returnTagDO = new TagsDO();
		returnTagDO.setId(tagDO.getId());
		returnTagDO.setTagName("Default TAG NAME");
		return returnTagDO.toString();
	}
}
