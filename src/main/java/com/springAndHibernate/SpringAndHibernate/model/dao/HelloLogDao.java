package com.springAndHibernate.SpringAndHibernate.model.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springAndHibernate.SpringAndHibernate.model.HelloLog;


@Transactional
@Repository
public interface HelloLogDao extends CrudRepository<HelloLog, Integer>{

	public List<HelloLog> findAll();
	
	public HelloLog findById(Integer id);
	
	
	
	
}
