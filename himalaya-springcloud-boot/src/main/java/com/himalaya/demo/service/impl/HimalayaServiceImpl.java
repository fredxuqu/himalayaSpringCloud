package com.himalaya.demo.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himalaya.demo.domain.CustomRepository;
import com.himalaya.demo.domain.HimalayaRepository;
import com.himalaya.demo.domain.HimalayaRepositoryCustom;
import com.himalaya.demo.domain.entity.UserDO;
import com.himalaya.demo.service.HimalayaService;

@Service
public class HimalayaServiceImpl implements HimalayaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaServiceImpl.class);
	
	@Autowired
	HimalayaRepository himalayaRepository;
	
	@Autowired
	HimalayaRepositoryCustom himalayaRepositoryCustom;
	
	
	@Autowired
	CustomRepository<UserDO, > customRepository;
	
	@Override
	public String service() {
		
		LOGGER.info("call service ");
		return "succ";
	}

	@Override
	public UserDO getUserById(Long id) {
		
		UserDO user = himalayaRepository.findOne(id);
		
		LOGGER.info("userName is " + user.getUsername());
		
		return user;
	}

	@Override
	public int count() {
		return himalayaRepositoryCustom.count();
	}

	@Override
	public BigDecimal countBalance() {
		return himalayaRepositoryCustom.countBalance();
	}

	@Override
	public List<UserDO> list() {
	
		return null;
	}
}
