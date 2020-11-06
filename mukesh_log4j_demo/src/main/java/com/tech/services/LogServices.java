package com.tech.services;

import org.apache.log4j.Logger;

public class LogServices {
	
	private static Logger logger = Logger.getLogger(LogServices.class);
	
	
	public void services1(String name) {
		logger.error("Hello ERROR " + name );
	}
	
	
	
	

}
