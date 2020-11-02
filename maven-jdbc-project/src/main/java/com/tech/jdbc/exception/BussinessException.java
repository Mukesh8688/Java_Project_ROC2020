package com.tech.jdbc.exception;

import java.lang.Exception;

public class BussinessException extends Exception{
	
	public BussinessException() {
		super();
	}
	
	public BussinessException(final String arg) {
		
		super(arg);
	}

}
