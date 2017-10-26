package com.icia.sboard.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.icia.sboard.service.UserService;
import com.icia.sboard.vo.AuthoritiesPropertyEditor;
import com.icia.sboard.vo.BirthDatePropertyEditor;
import com.icia.sboard.vo.Users;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.registerCustomEditor(String.class, "birthDate", new BirthDatePropertyEditor());
		dataBinder.registerCustomEditor(List.class, "authorities", new AuthoritiesPropertyEditor());
	}
	@GetMapping("/system/login")
	public String login(Model model) {
		model.addAttribute("viewName", "login.jsp");
		return "index";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("viewName", "main.jsp");
		return "index";
	}
	@GetMapping("/user/insert")
	public String insert(Model model) {
		model.addAttribute("viewName", "user/insert.jsp");
		return "index";
	}
	@PostMapping("/user/insert")
	public String insert(Users user) {
		service.insert(user);
		return "redirect:/";
	}
}
