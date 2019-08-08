package com.nglobal.status.management.repository;

import org.springframework.data.jpa.repository.Query;

import com.nglobal.status.management.persistence.entity.AppUser;

public interface CustomUserRepo {

	@Query("select app_user from AppUser app_user where app_user.username=?1")
	public AppUser findByUsername(String username) ;
	
	public void deleteById(Long id);
}
