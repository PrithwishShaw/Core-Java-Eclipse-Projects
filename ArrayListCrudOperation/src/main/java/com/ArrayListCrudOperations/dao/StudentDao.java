package com.ArrayListCrudOperations.dao;

import com.ArrayListCrudOperations.model.Student;

public interface StudentDao {

	void addStudent();
	
	boolean deleteStudent(int id);
	
	boolean updateStudent(int id,int choice);
	
	Student findStudent(int id);
	
	void displayAll();
	
}
