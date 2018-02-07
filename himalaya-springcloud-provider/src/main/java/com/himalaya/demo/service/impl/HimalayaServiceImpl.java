package com.himalaya.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.himalaya.demo.domain.TagsDO;
import com.himalaya.demo.service.HimalayaService;

@Service
public class HimalayaServiceImpl implements HimalayaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaServiceImpl.class);

	@Override
	public String service() {
		return "succ";
	}

	@Override
	public TagsDO query(long id) {
		return null;
	}
}