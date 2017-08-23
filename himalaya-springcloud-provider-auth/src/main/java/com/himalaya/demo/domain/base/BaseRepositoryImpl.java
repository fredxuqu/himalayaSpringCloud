package com.himalaya.demo.domain.base;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年8月16日 下午5:51:25 Description
 */
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T,ID>
        implements BaseRepository<T,ID> {

    private final EntityManager entityManager;

    //父类没有不带参数的构造方法，这里手动构造父类
    public BaseRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }

	@Override
	public List<Object[]> findBySQL(String sql) {
		return this.entityManager.createNativeQuery(sql).getResultList();
	}

	@Override
	public long countBySQL(String sql) {
		Object obj = this.entityManager.createNativeQuery(sql).getSingleResult();
		if(obj!=null){
			return Long.parseLong(obj.toString());
		}
		return 0;
	}
}
