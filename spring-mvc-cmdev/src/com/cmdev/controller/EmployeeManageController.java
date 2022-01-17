package com.cmdev.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee-manage")
public class EmployeeManageController {
	
	
	@GetMapping("")
	public String home(HttpSession session) {
		Object user = session.getAttribute("username");
		String url = "index";
		
		if (user != null)
			url = "/employee-management/employee-manage-home";
			
			
		return url;
	}
	
	@GetMapping("list")
	public String listEmp(HttpSession session) {
		Object user = session.getAttribute("username");
		String url = "index";
		
		if (user != null)
			url = "/employee-management/employee-list";
		
		
		return url;
	}
	
}
