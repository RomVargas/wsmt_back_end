package com.nglobal.status.management.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.nglobal.status.management.persistence.entity.AppUser;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long>{
	
	@Query("select app_user from AppUser app_user where app_user.username=?1")
	public AppUser findByUsername(String username) ;
}
