package com.icia.sboard.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	private String id;
	private String password;
	private boolean enabled;
	private String email;
	private String tel;
	private String birthDate;
	private List<Authority> authorities;
}
