package com.ArrayListCrudOperations.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ArrayListCrudOperations.dao.StudentDao;
import com.ArrayListCrudOperations.model.Student;

public class StudentDaoImpl implements StudentDao{
	
	//creating an array list
	List<Student> sList= new ArrayList<Student>();
	
	//creating scanner class
	Scanner sc= new Scanner(System.in);

	public void addStudent() {
		
		//creating student object
		Student ss= new Student();
		//input the details of students 
		System.out.println("Enter the Student ID: ");
		ss.setId(sc.nextInt());
		System.out.println("Enter the Student NAME: ");
		ss.setName(sc.next());
		System.out.println("Enter the Student MARKS: ");
		ss.setMarks(sc.nextDouble());
		
		//adding the student into the collection
		sList.add(ss);
		System.out.println(sList);
		
	}

	public boolean deleteStudent(int id) {
		boolean status=false;
		Student sDel= null;
		
		//finding the student
		for(Student s: sList) {
			if(s.getId()==id);
			sDel=s;
		}

		//check weather the record is present or not
		if(sDel==null)
			status= false;
		else {
			sList.remove(sDel);
			status= true;
		}
	
		return status;
	}



	public Student findStudent(int id) {
		
		Student sFind= null;
		
		//finding the student
		for(Student s:sList) {
			if(s.getId()==id)
				sFind=s;
		}
		
		return sFind;
	}

	@Override
	public boolean updateStudent(int id) {
		// TODO Auto-generated method stub
		
		boolean status= false;
		Student sFind= null;
		//finding the student
		for(Student s:sList) {
			if(s.getId()==id)
				sFind=s;

		}
		if(sFind!=null)
		{
			System.out.println("Enter the Student NAME: ");
			sFind.setName(sc.next());
			System.out.println("Enter the Student MARKS: ");
			sFind.setMarks(sc.nextDouble());
			status= true;
		}
		else
			status=false;
	
		return status;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		for(Student s:sList) {
			System.out.println(s);
		}
		
	}
	
	
}
