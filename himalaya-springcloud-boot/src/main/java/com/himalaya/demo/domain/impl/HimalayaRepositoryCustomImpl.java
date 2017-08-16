package com.himalaya.demo.domain.impl;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.himalaya.demo.domain.HimalayaRepositoryCustom;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午2:43:13
* Description
* TODO
*/
@Repository
public class HimalayaRepositoryCustomImpl implements HimalayaRepositoryCustom {

	@Autowired
    @PersistenceContext
    private EntityManager entityManager;
	
	/**
	 * use native sql to query.
	 */
	@Override
	public int count() {
		Object obj = entityManager.createNativeQuery("select count(*) from user").getSingleResult();
		Integer result = Integer.parseInt(obj.toString());
		return result;
	}

	/**
	 * use HQL to query.
	 */
	@Override
	public BigDecimal countBalance() {
		Object obj = entityManager.createQuery("select sum(balance) from UserDO").getSingleResult();
		BigDecimal result = new BigDecimal(obj.toString());
		return result;
	}
}

