package com.kirana.register.exception;


public class CustomInternalServerException extends RuntimeException {

	public CustomInternalServerException() {
		super();
	}

	public CustomInternalServerException(final String message) {
		super(message);
	}

	public CustomInternalServerException(final String message, Throwable cause) {
		super(message, cause);
	}
}
