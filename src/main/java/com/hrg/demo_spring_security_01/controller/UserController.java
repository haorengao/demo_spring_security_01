package com.hrg.demo_spring_security_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrg.demo_spring_security_01.bean.User;
import com.hrg.demo_spring_security_01.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/a/getUserByUserName")
	@ResponseBody
	public Object getUserByUserName(String userName) {
		
		User user = userService.getByUserName(userName);
		
		return user;
	}
	
	@RequestMapping("/b/getUserByUserName")
	@ResponseBody
	public Object getUserByUserNameB(String userName) {
		
		User user = userService.getByUserName(userName);
		
		return user;
	}
	
	
	
}
