package com.himalaya.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.himalaya.demo.domain.entity.UserDO;

public interface HimalayaService {
	
	public String service();
	public UserDO getUserById(Long id);
	
	public int count();
	public BigDecimal countBalance();
	
	public List<UserDO> list();
}
