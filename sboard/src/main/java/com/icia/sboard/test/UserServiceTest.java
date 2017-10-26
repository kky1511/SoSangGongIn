package com.icia.sboard.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.icia.sboard.service.UserService;
import com.icia.sboard.vo.Authority;
import com.icia.sboard.vo.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class UserServiceTest {
	@Autowired
	private UserService service;
	@Test
	public void insertTest() {
		List<Authority> list = new ArrayList<Authority>();
		list.add(new Authority("ROLE_USER"));
		list.add(new Authority("ROLE_MANAGER"));
		list.add(new Authority("ROLE_ADMIN"));
		Users user = new Users("aaaa", "1111", true, "bbbb", "1234", "19900101", list);
		service.insert(user);
	}
}









