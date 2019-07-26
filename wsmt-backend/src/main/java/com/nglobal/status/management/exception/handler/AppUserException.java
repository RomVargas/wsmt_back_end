package com.nglobal.status.management.exception.handler;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppUserException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private HttpStatus HTTPcode;
	private String message;
	public HttpStatus getHTTPcode() {
		return HTTPcode;
	}
	public void setHTTPcode(HttpStatus hTTPcode) {
		HTTPcode = hTTPcode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
