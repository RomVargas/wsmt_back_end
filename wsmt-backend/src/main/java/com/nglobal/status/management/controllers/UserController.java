package com.nglobal.status.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.nglobal.status.management.model.JSONResponse;
import com.nglobal.status.management.persistence.entity.AppUser;
import com.nglobal.status.management.repository.AppUserRepository;
import com.nglobal.status.management.repository.CustomUserRepo;
import com.nglobal.status.management.repository.Impl.AppUserRepoImpl;

@RestController
/*@CrossOrigin(origins= {
		"http://localhost:4200"
})*/
@RequestMapping("/user")
public class UserController {

	@Autowired
	JSONResponse jSONResponse;
	
	@Autowired
	AppUserRepository appUserRepo;
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/allusers")
	public ResponseEntity<?> getUsers() {
		return new ResponseEntity<>(appUserRepo.findAll(),HttpStatus.OK);
	}
	
	//@Secured("ROLE_ADMIN")
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody AppUser appUser){
		return new ResponseEntity<>(appUserRepo.save(appUser),HttpStatus.CREATED);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/getuser/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		return new ResponseEntity<>(appUserRepo.findById(id),HttpStatus.OK);
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateUser(@PathVariable Long id,@RequestBody AppUser appUser){
		return new ResponseEntity<>(appUserRepo.save(appUser),HttpStatus.OK);
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteUser(@PathVariable Long id){
		appUserRepo.deleteById(id);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/username/{username}")
	public ResponseEntity<?> getUserByUsername(@PathVariable String username){
		System.out.println("entra controller");
		return new ResponseEntity<>(appUserRepo.findByUsername(username),HttpStatus.OK);
	}
}
