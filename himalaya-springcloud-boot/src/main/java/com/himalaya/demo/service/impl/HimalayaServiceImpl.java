package com.himalaya.demo.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.himalaya.demo.domain.entity.UserDO;
import com.himalaya.demo.service.HimalayaService;

@Service
public class HimalayaServiceImpl implements HimalayaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaServiceImpl.class);

	@Override
	public String service() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDO getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigDecimal countBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> list() {
		// TODO Auto-generated method stub
		return null;
	}
}
