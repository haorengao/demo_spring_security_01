package com.hrg.demo_spring_security_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hrg.demo_spring_security_01.dao")
public class DemoSpringSecurity01Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringSecurity01Application.class, args);
	}
}
