package com.tech.bankproject.model;

import java.util.Scanner; 

public class RegisterModel {
	
	private String username;
	private String password;
	private String email;
	
	
	// create scanner object
	// taking inputs from console
	
	Scanner scanner = new Scanner(System.in);
	
	
	// constructor
	public RegisterModel() {
		
	}
	
	public RegisterModel(String username,String password,String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
	// getter and shetter
	
    public String getUsername() {
    	return username;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }
    
    
    public String getPassword() {
    	return password;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public void askingUsernamePassword() {
    	
    	
    	System.out.println();
        System.out.println("Please Enter Username:");
        setUsername(scanner.nextLine());
        System.out.println("Please Enter Password:");
        setPassword(scanner.nextLine());
    	
    }
    
   public void askingUsernamePasswordEmail() {
    	
    	
    	System.out.println();
        System.out.println("Please Enter Username:");
        setUsername(scanner.nextLine());
        System.out.println("Please Enter Password:");
        setPassword(scanner.nextLine());
        System.out.println("Please Enter Email: ");
   	    setEmail(scanner.nextLine());
    	
    }
    
    
    
}
