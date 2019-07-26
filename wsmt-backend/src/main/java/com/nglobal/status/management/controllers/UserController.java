package com.nglobal.status.management.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.nglobal.status.management.DAO.AppUserDAO;
import com.nglobal.status.management.model.JSONResponse;
import com.nglobal.status.management.persistence.entity.AppUser;
import com.nglobal.status.management.repository.AppUserRepository;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	JSONResponse jSONResponse;
	
	@Autowired
	AppUserRepository appUserRepository;
	
	@GetMapping("/allusers")
	public ResponseEntity<?> getHome() {
		return new ResponseEntity<>(appUserRepository.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@Valid  @RequestBody AppUser appUser){
		return new ResponseEntity<>(appUserRepository.save(appUser),HttpStatus.OK);
	}
}
