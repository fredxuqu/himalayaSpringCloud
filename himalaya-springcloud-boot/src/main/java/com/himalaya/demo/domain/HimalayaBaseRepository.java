package com.himalaya.demo.domain;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.himalaya.demo.domain.base.BaseRepository;
import com.himalaya.demo.domain.entity.UserDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午3:00:02
* Description
*/
public interface HimalayaBaseRepository extends BaseRepository<UserDO, Long> , JpaSpecificationExecutor<UserDO> {

}
