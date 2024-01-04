package com.kirana.register.exception;


public class CustomForbiddenException extends RuntimeException{

	public CustomForbiddenException() {
		super();
	}

	public CustomForbiddenException(final String message) {
		super(message);
	}
	
	public CustomForbiddenException(final String message, Throwable cause) {
		super(message, cause);
	}
}
