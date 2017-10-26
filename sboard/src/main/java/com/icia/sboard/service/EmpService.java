package com.icia.sboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icia.sboard.dao.EmpDao;
import com.icia.sboard.vo.Emp;

@Service
public class EmpService {
	@Autowired
	private EmpDao dao;
	// 트랜잭션은 일의 덩어리. commit 또는 rollback
	@Transactional
	public void insertAndUpdate(Emp emp) { 
		dao.insert(emp);	// 성공
		emp.setDeptno(90);
		dao.update(emp);  	// 실패 -> 트랜잭션이 roll back
	}
}
