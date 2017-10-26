package com.icia.sboard.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.sboard.vo.Authority;
import com.icia.sboard.vo.Users;

@Repository
public class UserDao {
	@Autowired
	private SqlSessionTemplate tpl;
	public void insertUser(Users user) {
		tpl.insert("userMapper.insertUser", user);
	}
	public void insertAuthority(String id, Authority authority) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("authority", authority.getAuthority());
		tpl.insert("userMapper.insertAuthority", map);
	}
}










