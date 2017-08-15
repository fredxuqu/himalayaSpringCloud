package com.himalaya.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.himalaya.demo.domain.entity.UserDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午3:00:02
* Description
*/
@Repository
public interface HimalayaRepository extends JpaRepository<UserDO, Long>{

}
