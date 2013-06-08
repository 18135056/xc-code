package cn.xc.mybatis.repository.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.xc.mybatis.model.PersonDO;
import cn.xc.mybatis.repository.PersonRepository;
/**
 * @author wxc
 * */
public class PersonRepositoryImpl extends SqlMapClientDaoSupport implements PersonRepository{
	
	public PersonDO getPersonDOById(Long id){
		return null;
	}
}