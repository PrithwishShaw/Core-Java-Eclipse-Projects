package com.student;

import java.util.ArrayList;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> myClass= new ArrayList<>();
		myClass.add(new Student(101,"Prithwish", 89.7f));
		myClass.add(new Student(102,"Sweta", 80.7f));
		
	
		for(Student s:myClass)
		{
			System.out.println(s);
		}
		
	}

}
