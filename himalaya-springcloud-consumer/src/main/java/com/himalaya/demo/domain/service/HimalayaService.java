package com.himalaya.demo.domain.service;

import com.himalaya.demo.domain.UserDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月18日 上午11:20:45
* Description
*/
public interface HimalayaService {
	
	UserDO findById(long id);
	String service(); 
}
