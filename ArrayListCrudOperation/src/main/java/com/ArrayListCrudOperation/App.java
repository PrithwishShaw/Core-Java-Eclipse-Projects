package com.ArrayListCrudOperation;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.ArrayListCrudOperations.dao.StudentDao;
import com.ArrayListCrudOperations.daoimpl.StudentDaoImpl;
import com.ArrayListCrudOperations.model.Student;

public class App 
{
	
	static JFrame f1;
	
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add student");
		System.out.println("2. Delete Student");
		System.out.println("3. Update Student");
		System.out.println("4. Search Student");
		System.out.println("5. Display all the students");
		System.out.println("6. Exit");
		
	}
	public static void main( String[] args ) {
		
		f1 = new JFrame();
		//creating scanner object
		Scanner sc= new Scanner(System.in);
		//creating object of impl
		StudentDao school= new StudentDaoImpl();
		
		try{//declaring variable choice
		int ch=0;
		
		do {
			menu();
			ch= sc.nextInt();
			switch(ch) {
			case 1:
				school.addStudent();
				JOptionPane.showMessageDialog(null, "Student inserted......");
				//System.out.println("Student inserted..........");
				break;
			case 2:
				System.out.println("Enter the ID to be deleted: ");
				int id=sc.nextInt();
				boolean flag= school.deleteStudent(id);
				if (flag)
					System.out.println("Student deleted.........");
				else
					System.out.println("Student not found..........");
				break;
			case 3:
				id=(Integer.parseInt(JOptionPane.showInputDialog("Enter the ID:")));
				//System.out.println("Enter the ID to be updated: ");
				//id=sc.nextInt();
				int choice=0;
				System.out.println("1. Update Name\n"+"2. Updating Marks: ");
				choice= sc.nextInt();
				switch(choice)
				{
				case 1:
					flag= school.updateStudent(id,choice);
					if (flag)
						System.out.println("Student updated.........");
					else
						System.out.println("Student not fsound..........");
					break;
				case 2:	
					flag= school.updateStudent(id,choice);
					if (flag)
						System.out.println("Student updated.........");
					else
						System.out.println("Student not found..........");
				break;
				default:
					System.out.println("No such property........");
					break;
				}
			case 4:
				Student ss= null;
				System.out.println("Enter the ID to be searched: ");
				id=sc.nextInt();
				ss=school.findStudent(id);
				if(ss==null)
					System.out.println("Student not find........");
				else
					System.out.println("Student ID: "+ss.getId()+" Name: "+ss.getName()+" Marks: "+ss.getMarks());
				break;
			case 5:
				school.displayAll();
			case 6:
				System.exit(0);
			default:
				System.out.println("Wrong input........");

			}
		}
	
		while(ch!=6);
		
		//end of while
		
		sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	
		}
	}

