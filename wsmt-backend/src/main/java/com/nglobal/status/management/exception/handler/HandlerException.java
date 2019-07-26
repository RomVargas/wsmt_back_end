package com.nglobal.status.management.exception.handler;

import javax.persistence.NoResultException;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nglobal.status.management.model.JSONResponse;

@ControllerAdvice
public class HandlerException {

	@ExceptionHandler(AppUserException.class)
	public ResponseEntity<JSONResponse> UserException(AppUserException e){
		JSONResponse jSONResponse = new JSONResponse();
		jSONResponse.setMessage(e.getMessage());
		return new ResponseEntity<JSONResponse>(jSONResponse, e.getHTTPcode());
	}
	
	@ExceptionHandler(NoResultException.class)
	public ResponseEntity<JSONResponse> NotResultException(NoResultException e){
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setMessage("User not Found");
		return new ResponseEntity<JSONResponse>(jsonResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<JSONResponse> ValidationException(ConstraintViolationException e){
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setMessage("Bad Request");
		return new ResponseEntity<JSONResponse>(jsonResponse, HttpStatus.BAD_REQUEST);
	}
}
