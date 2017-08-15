package com.himalaya.demo.domain.support;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.mapping.context.MappingContext;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.data.repository.core.support.TransactionalRepositoryFactoryBeanSupport;
import org.springframework.util.Assert;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午6:02:26
* Description
*/
public class CustomRepositoryFactoryBean<T extends Repository<S, ID>, S, ID extends Serializable>
		extends TransactionalRepositoryFactoryBeanSupport<T, S, ID> {

	private EntityManager entityManager;

	/**
	 * Creates a new {@link JpaRepositoryFactoryBean} for the given repository interface.
	 * 
	 * @param repositoryInterface must not be {@literal null}.
	 */
	public CustomRepositoryFactoryBean(Class<? extends T> repositoryInterface) {
		super(repositoryInterface);
	}

	/**
	 * The {@link EntityManager} to be used.
	 * 
	 * @param entityManager the entityManager to set
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport#setMappingContext(org.springframework.data.mapping.context.MappingContext)
	 */
	@Override
	public void setMappingContext(MappingContext<?, ?> mappingContext) {
		super.setMappingContext(mappingContext);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.repository.support.
	 * TransactionalRepositoryFactoryBeanSupport#doCreateRepositoryFactory()
	 */
	@Override
	protected RepositoryFactorySupport doCreateRepositoryFactory() {
		return createRepositoryFactory(entityManager);
	}

	/**
	 * Returns a {@link RepositoryFactorySupport}.
	 * 
	 * @param entityManager
	 * @return
	 */
	protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
		return new JpaRepositoryFactory(entityManager);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() {

		Assert.notNull(entityManager, "EntityManager must not be null!");
		super.afterPropertiesSet();
	}
}
