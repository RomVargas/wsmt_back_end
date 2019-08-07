package com.nglobal.status.management.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nglobal.status.management.persistence.entity.AppUser;

public interface UserLoginRepo extends CrudRepository<AppUser, Long>{
	
	public AppUser findByUserName(String username);
	
	@Query("select app_user from AppUser app_user where app_user.email=?1")
	public AppUser findByEmail(String email);

}
