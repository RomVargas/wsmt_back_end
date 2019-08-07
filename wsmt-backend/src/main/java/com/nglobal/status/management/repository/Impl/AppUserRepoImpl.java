package com.nglobal.status.management.repository.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nglobal.status.management.persistence.entity.AppUser;
import com.nglobal.status.management.repository.AppUserRepository;

@Service
public class AppUserRepoImpl implements AppUserRepository{

	@Autowired
	AppUserRepository appUserRepo;
	
	@Override
	@Transactional(readOnly=true)
	public List<AppUser> findAll(){
		return (List<AppUser>)appUserRepo.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Optional<AppUser> findById(Long id) {
		return appUserRepo.findById(id);
	}
	
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
	@Transactional
	public AppUser save(AppUser appUser) {
		return appUserRepo.save(appUser);
	}
	
	@Override
	public <S extends AppUser> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
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

	@Override
	public List<AppUser> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends AppUser> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<AppUser> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AppUser getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AppUser> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AppUser> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<AppUser> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AppUser> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AppUser> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AppUser> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends AppUser> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AppUser> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

}
