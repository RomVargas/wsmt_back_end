package com.nglobal.status.management.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
@Primary
public class JSONResponse {
	
	private String message;

}
