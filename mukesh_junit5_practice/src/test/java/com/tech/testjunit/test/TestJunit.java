package com.tech.testjunit.test;

import org.junit.jupiter.api.Test;

import com.tech.testJunit.MessageUtil;

import org.junit.jupiter.api.Assertions;

public class TestJunit {
	
	
	String message = "Hello Mukesh";
	
	MessageUtil messageUnit = new MessageUtil("Hello Mukesh");
	
	@Test
	public void testPrintMessage() {
		Assertions.assertEquals(message, messageUnit.printMessage());
	}
	
	

}
