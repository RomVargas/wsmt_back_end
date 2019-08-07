package com.nglobal.status.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nglobal.status.management.persistence.entity.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	
}
