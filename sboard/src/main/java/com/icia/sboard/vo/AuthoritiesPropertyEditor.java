package com.icia.sboard.vo;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;

// 커맨드 객체를 생성할 때 스프링의 해석방식이 마음에 안들 때 작성
public class AuthoritiesPropertyEditor extends PropertyEditorSupport {
	public void setAsText(String text) {
		List<Authority> list = new ArrayList<Authority>();
		System.out.println(text);
		if(text.equals("ROLE_USER")) {
			list.add(new Authority("ROLE_USER"));
		} else if(text.equals("ROLE_MANAGER")) {
			list.add(new Authority("ROLE_USER"));
			list.add(new Authority("ROLE_MANAGER"));
		} else if(text.equals("ROLE_ADMIN")) {
			list.add(new Authority("ROLE_USER"));
			list.add(new Authority("ROLE_MANAGER"));
			list.add(new Authority("ROLE_ADMIN"));
		}
		setValue(list);
	}
}
