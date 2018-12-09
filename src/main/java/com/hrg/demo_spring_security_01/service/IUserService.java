package com.hrg.demo_spring_security_01.service;

import com.hrg.demo_spring_security_01.bean.User;

public interface IUserService {
	
	 User getByUserName(String userName);
}
