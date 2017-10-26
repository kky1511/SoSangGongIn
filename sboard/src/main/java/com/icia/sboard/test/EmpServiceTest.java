package com.icia.sboard.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.icia.sboard.service.EmpService;
import com.icia.sboard.vo.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class EmpServiceTest {
	@Inject
	private EmpService service;
	@Test
	public void test() {
		Emp emp = new Emp(1000, "홍길동", 20);
		service.insertAndUpdate(emp);
	}
}








