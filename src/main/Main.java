package main;

import service.StudentManagementSystem;

import java.util.Scanner;

//import java.util.*;

//import model.Student;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner sc = new Scanner(System.in);
		
//		sms.addStudent(new Student(1, "Paras",93));
//		sms.addStudent(new Student(2, "Ajinkya",97));
//		sms.addStudent(new Student(3, "Aditya",95));
//		sms.addStudent(new Student(4, "Bhaiyya",92));
//		sms.addStudent(new Student(5, "Bhai",100));

		sms.addStudent("Paras",93);
		sms.addStudent("Ajinkya",97);
		sms.addStudent("Aditya",95);
		sms.addStudent("Bhaiyya",92);
		sms.addStudent("Bhai",100);
		
		int ch;
		int rollNo, marks;
		String name;
		while(true) {
			System.out.println();
			System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Get All Students");
            System.out.println("5. Get Student By Roll No");
            System.out.println("6. Exit");
            
            System.out.printf("\nEnter your choice: ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.printf("\nEnter Student name: ");
				sc.nextLine();
				name = sc.nextLine();
//				System.out.print("\nEnter Student Roll No.: ");
//				rollNo = sc.nextInt();
				System.out.print("\nEnter Student marks: ");
				marks = sc.nextInt();
				sms.addStudent(name, marks);
				break;
			case 2:
				System.out.print("\nEnter Roll No.: ");
				rollNo = sc.nextInt();
				sms.removeStudent(rollNo);
				break;
			case 3:
				System.out.print("\nEnter roll No.: ");
				rollNo = sc.nextInt();
				sms.updateStudent(rollNo);
				break;
			case 4:
				sms.getAllStudents();
				break;
			case 5:
				System.out.print("\nEnter Roll No.: ");
				rollNo = sc.nextInt();
				sms.getStudent(rollNo);
				break;
			default:
				System.out.println("Incorrect choice!");
				break;
				
			case 6:
				System.out.println("Exiting...");
				System.exit(0);				
			}
			
		}
		
//		sms.getAllStudents();
//		System.out.println();
//		sms.getStudent(1);
//		System.out.println("\n");
//		sms.removeStudent(2);
//		sms.getAllStudents();
		
//		sms.updateStudent(5);
	}

}
