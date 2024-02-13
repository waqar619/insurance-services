package com.insurance.insuranceservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoSuchElementException extends RuntimeException {

	private int errorCode;
	

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public NoSuchElementException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;

	}

	public NoSuchElementException(String message, Throwable cause) {
		super(message, cause);

	}

}
