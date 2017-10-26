package com.icia.sboard.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icia.sboard.dao.UserDao;
import com.icia.sboard.vo.Authority;
import com.icia.sboard.vo.Users;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Transactional
	public void insert(Users user) {
		// 사용자가 입력한 비밀번호를 암호화
		String password = passwordEncoder.encode(user.getPassword());
		// 암호화한 비밀번호로 변경
		user.setPassword(password);
		dao.insertUser(user);
		List<Authority> list = user.getAuthorities();
		for(Authority authority: list) {
			dao.insertAuthority(user.getId(), authority);
		}
	}
	// updateUser는 관리자 또는 자기자신인 경우에만 가능
	// 자기자신을 확인하는 방법 : principal.username이 user.id와 같다
	@PreAuthorize("#user.id==principal.username or hasRole('ROLE_ADMIN')")
	public void updateUser(Users user) {
		System.out.println("업데이트 실행");
	}
	@PreAuthorize("#id==principal.username or hasRole('ROLE_ADMIN')")
	public void deleteUser(String id) {
		System.out.println("삭제 실행");
	}
	
	// 로그인이 되어있는 지 확인 -> 안된 경우 로그인으로 보내버림
	@PreAuthorize("isAuthenticated()")
	@PostAuthorize("returnObject.id==principal.username or hasRole('ROLE_ADMIN')")
	public Users getUser(String id) {
		return new Users();
	}
}







