package com.sai.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException() {
		super("Resource was not found");
	}
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
