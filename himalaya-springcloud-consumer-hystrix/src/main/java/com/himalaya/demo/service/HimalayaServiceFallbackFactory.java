package com.himalaya.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.himalaya.demo.domain.TagsDO;

import feign.hystrix.FallbackFactory;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年5月17日 下午5:02:46
* Description
*/
@Component
public class HimalayaServiceFallbackFactory implements FallbackFactory<HimalayaFeignClient>{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaServiceFallbackFactory.class);
	
	@Override
	public HimalayaFeignClient create(Throwable cause) {
		return new HimalayaFeignClient(){

			@Override
			public String findById(long id) {
				HimalayaServiceFallbackFactory.LOGGER.info("Fallback, cause by : " + cause);
				TagsDO tagDO = new TagsDO();
				tagDO.setId(id);
				tagDO.setTagName("Default TAG NAME");
				return tagDO.toString();
			}

			@Override
			public String findByTag(TagsDO tagDO) {
				HimalayaServiceFallbackFactory.LOGGER.info("Fallback, cause by : " + cause);
				TagsDO returnTagDO = new TagsDO();
				returnTagDO.setId(tagDO.getId());
				returnTagDO.setTagName("Default TAG NAME");
				return returnTagDO.toString();
			}
		};
	}
}
