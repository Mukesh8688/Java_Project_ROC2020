package com.tech.bankproject.exception;

import java.lang.Exception;

public class BusinessException extends Exception {
	
	
	public BusinessException() {
		
	}
	
	public BusinessException(final String message) {
		super(message);
		
	}
	

}
