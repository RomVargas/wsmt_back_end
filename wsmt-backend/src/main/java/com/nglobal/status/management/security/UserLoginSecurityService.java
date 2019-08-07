package com.nglobal.status.management.security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nglobal.status.management.persistence.entity.AppUser;
import com.nglobal.status.management.repository.UserLoginRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserLoginSecurityService implements UserDetailsService{
	
	private Logger logger = LoggerFactory.getLogger(UserLoginSecurityService.class);
	
	@Autowired
	private UserLoginRepo userLoginRepo;

	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser appUser = userLoginRepo.findByUserName(username);
		
		if(appUser == null) {
			logger.error("Login Error: User " + appUser.getUserName() +" do not Exist");
			throw new UsernameNotFoundException("Login Error: User " + appUser.getUserName() +" do not Exist");
		}
		
		List<GrantedAuthority> authorities = appUser.getRole()
													.stream()
													.map(role -> new SimpleGrantedAuthority(role.getNameRole()))
													.peek(authority -> logger.info("Role: " + authority.getAuthority()))
													.collect(Collectors.toList());
		
		return new User(username, appUser.getPassword(), appUser.getEnabled(), true, true, true, authorities);
	}

}
