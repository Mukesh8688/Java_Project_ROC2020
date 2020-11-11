package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(101,"Mukesh",23));
		studentList.add(new Student(103,"John",23));
		studentList.add(new Student(106,"Preet",27));  
		studentList.add(new Student(105,"Jai",21));  
		studentList.add(new Student(104,"Priyesh",21)); 
		
		
		Collections.sort(studentList);
		
		for(Student student : studentList ) {
			System.out.println("[ " + student.getRollNo() + " " 
					                +student.getName()  + " " 
					                + student.getAge()  + " ] ");
		}

	}

}
