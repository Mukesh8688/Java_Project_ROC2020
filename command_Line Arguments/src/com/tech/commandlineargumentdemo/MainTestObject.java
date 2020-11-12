package com.tech.commandlineargumentdemo;

public class MainTestObject {

	public static void main(String[] args) {
		
		
		TestObjectBehavior obj = new TestObjectBehavior();
		
		System.out.println(obj.toString());
		
		obj.setvalue(2, "Mukesh");
		
		System.out.println(obj.toString());
		
		
//		TestObjectBehavior obj1 = new TestObjectBehavior();
//		
//		obj1.setValueTest(obj1);
//		
//		
//		System.out.println(obj1);
//		
//		
//	    TestObjectBehavior obj2 = new TestObjectBehavior();
//		
//		obj2.setValueTest();
//		
//		
//		System.out.println(obj2);
		
		TestObjectBehavior obj3 = new TestObjectBehavior();
		
		TestObjectBehavior obj5 = new TestObjectBehavior();
		
		TestObjectBehavior obj6 = null;
		
		
		
	    
		TestObjectBehavior obj4 = obj3.setValueTestReturnType(obj6);;
		
		
		System.out.println(obj4);
		

	}

}
