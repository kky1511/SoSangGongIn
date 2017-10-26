package com.icia.sboard.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.sboard.vo.Emp;

@Repository
public class EmpDao {
	@Autowired
	private SqlSessionTemplate tpl;
	public void insert(Emp emp) {
		tpl.insert("empMapper.insertEmp", emp);
	}
	public void update(Emp emp) {
		tpl.update("empMapper.updateEmp", emp);
	}
}
