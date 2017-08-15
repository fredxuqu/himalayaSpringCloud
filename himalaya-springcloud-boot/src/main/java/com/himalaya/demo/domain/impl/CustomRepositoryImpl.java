package com.himalaya.demo.domain.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.himalaya.demo.domain.CustomRepository;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午5:51:25
* Description
*/
public class CustomRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> 
	implements CustomRepository<T, ID> {

	private final EntityManager entityManager;
	
	public CustomRepositoryImpl(Class<T> domainClass, EntityManager manager){
		super(domainClass, manager);
		this.entityManager = manager;
	}
	
	@Override
	public List<Object[]> listBySQL() {
		List<Object[]> results = entityManager.createQuery("select * from UserDO").getResultList();
		return results;
	}
}
