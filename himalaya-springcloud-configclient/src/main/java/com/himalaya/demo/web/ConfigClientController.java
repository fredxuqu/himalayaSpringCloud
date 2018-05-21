package com.himalaya.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年5月21日 下午2:27:17
* Description
*/
@RestController
public class ConfigClientController {

	@Value("${app.version}")
	private String version;
	
	@GetMapping("/version")
	public String version(){
		return version;
	}
	
	@GetMapping("/")
	public String index(){
		return "ConfigClientController";
	}
}
