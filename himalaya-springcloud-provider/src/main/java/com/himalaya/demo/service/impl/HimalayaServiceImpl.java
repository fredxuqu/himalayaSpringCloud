package com.himalaya.demo.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himalaya.demo.domain.HimalayaBaseRepository;
import com.himalaya.demo.domain.HimalayaRepositoryCustom;
import com.himalaya.demo.domain.entity.UserDO;
import com.himalaya.demo.service.HimalayaService;

@Service
public class HimalayaServiceImpl implements HimalayaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaServiceImpl.class);

	@Autowired
	HimalayaBaseRepository himalayaBaseRepository;
	
	@Autowired
	HimalayaRepositoryCustom himalayaRepositoryCustom;
	
	@Override
	public String service() {
		// TODO Auto-generated method stub
		return "succ";
	}

	@Override
	public UserDO getUserById(Long id) {
		return himalayaBaseRepository.findOne(id);
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
	public List<Object[]> list() {
		return null;
	}
}
