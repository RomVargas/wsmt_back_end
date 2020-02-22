package com.nglobal.status.management.repository.Impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.nglobal.status.management.persistence.entity.AppUser;
import com.nglobal.status.management.repository.AppUserRepository;

public class AppUserRepoImpl implements AppUserRepository{

	@Autowired
	AppUserRepository appUserRepo;
	
	@Override
	@Transactional
	public void deleteById(Long id) {
		AppUser appUserCustom = new AppUser();
		Optional<AppUser> appUser = appUserRepo.findById(id);
		if(appUser.isPresent()) {
			appUserCustom = appUser.get();
			appUserCustom.setEnabled(false);	
		}
		appUserRepo.save(appUserCustom);
	}
	
	@Override
	public AppUser findByUsername(String username) {
		return appUserRepo.findByUsername(username);
	}
	
	@Override
	public Optional<AppUser> findById(Long id) {
		return appUserRepo.findById(id);
	}

	@Override
	public <S extends AppUser> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AppUser> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<AppUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<AppUser> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(AppUser entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends AppUser> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
