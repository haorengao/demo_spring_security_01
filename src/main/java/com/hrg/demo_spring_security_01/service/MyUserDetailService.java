package com.hrg.demo_spring_security_01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hrg.demo_spring_security_01.bean.User;
@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private IUserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user = userService.getByUserName(userName);
		
		if (user == null) {			
			throw new UsernameNotFoundException("用户不存在！");			
		}		
		
		List<SimpleGrantedAuthority> simpleGrantedAuthorities = createAuthorities(user.getRoles());
		
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),simpleGrantedAuthorities);
	}
	
	 /**
     * 权限字符串转化
     *
     * 如 "USER,ADMIN" -> SimpleGrantedAuthority("USER") + SimpleGrantedAuthority("ADMIN")
     *
     * @param roleStr 权限字符串
     */
    private List<SimpleGrantedAuthority> createAuthorities(String roleStr){
        String[] roles = roleStr.split(",");
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        for (String role : roles) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return simpleGrantedAuthorities;
    }

}
