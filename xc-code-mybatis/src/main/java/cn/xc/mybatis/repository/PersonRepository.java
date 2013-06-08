package cn.xc.mybatis.repository;

import cn.xc.mybatis.model.PersonDO;

/**
 * @author wxc
 * */
public interface PersonRepository {
	
	public PersonDO getPersonDOById(Long id);
}