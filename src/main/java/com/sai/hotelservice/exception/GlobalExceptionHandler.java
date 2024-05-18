package com.sai.hotelservice.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> idNotFound(Exception e){
		Map<String,Object> mp = new HashMap<String, Object>();
		mp.put("message", e.getMessage());
		mp.put("status", HttpStatus.NOT_FOUND);
		mp.put("success", "true");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mp);
	}
}
