package com.tech;


import org.apache.log4j.Logger;

import com.tech.services.LogServices;

public class LogMain {
	
	
	private static Logger log = Logger.getLogger(LogMain.class);

	public static void main(String[] args) {
		
		
		log.trace("Hello from Trace");
	    log.debug("Hello from debug");
	    log.info("HELLO from INFO");
	    log.warn("Hello from WARN");
	    log.error("Hello from ERROR");
	    log.fatal("Hello from FATAL");
	    
	    
	   LogServices logservices = new LogServices();
	   logservices.services1("Mukesh");

	}

}
