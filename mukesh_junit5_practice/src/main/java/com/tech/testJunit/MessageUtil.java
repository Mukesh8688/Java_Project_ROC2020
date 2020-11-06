package com.tech.testJunit;

public class MessageUtil {
	
	private String message;
	
	// constructor with parameter 
	
	public MessageUtil(String message) {
		this.message = message;
	}
	
	// print message
	
	public String printMessage() {
		
		System.out.println(message);
		return message;
	}

}
