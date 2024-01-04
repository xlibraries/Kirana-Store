package com.kirana.register.exception;


public class CustomBadRequestException extends RuntimeException {

    public CustomBadRequestException() {
        super();
    }

    public CustomBadRequestException(final String message) {
        super(message);
    }

    public CustomBadRequestException(final String message, Throwable cause) {
        super(message, cause);
    }
}
