package com.hrg.demo_spring_security_01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrg.demo_spring_security_01.bean.User;
import com.hrg.demo_spring_security_01.dao.IUserDao;
import com.hrg.demo_spring_security_01.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getByUserName(String userName) {
		
				
		return userDao.getByUserName(userName);
	}

}
