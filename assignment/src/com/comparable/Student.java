package com.comparable;

import java.lang.Comparable;


public class Student implements Comparable<Student>{
	
	private int rollNo;
	private String name;
	private int age;
	
	
	//Construcator
	
	public Student() {
	
	}

	public Student(int rollNo, String name, int age) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	
	
   // Only Getter

	public int getRollNo() {
		return rollNo;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	

	@Override
	public int compareTo(Student student) {
		
		if(this.age == student.age) return 0;
		if(this.age > student.age) return 1;
		return -1;
	}
	
	

}
