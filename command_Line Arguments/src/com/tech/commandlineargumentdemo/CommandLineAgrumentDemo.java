package com.tech.commandlineargumentdemo;

public class CommandLineAgrumentDemo {

	public static void main(String[] args) {
		
		
		for(String s:args) {
			System.out.println("args array items are :");
			System.out.println(s);
		}
		
		
		String name = "Mukesh";
		String name1 = "mukesh";
		if(name.toLowerCase().equals(name1.toLowerCase())) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
