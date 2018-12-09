package com.hrg.demo_spring_security_01.dao;

import org.apache.ibatis.annotations.Mapper;

import com.hrg.demo_spring_security_01.bean.User;

@Mapper
public interface IUserDao {

	User getByUserName(String userName);
}
