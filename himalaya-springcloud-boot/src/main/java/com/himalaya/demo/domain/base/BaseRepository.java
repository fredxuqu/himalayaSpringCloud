package com.himalaya.demo.domain.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年8月16日 下午5:51:25 Description
 */
@NoRepositoryBean
//@Transactional(readOnly=true)
public interface BaseRepository<T,ID extends Serializable> extends JpaRepository<T,ID> {
    
	public List<Object[]> listBySQL(String sql);
    
    @Transactional
    public void updateBySql(String sql,Object...args);
    
    @Transactional
    public void updateByHql(String hql,Object...args);
}
