package service;

import java.util.*;

import model.Student;

public class StudentManagementSystem {
	Scanner sc = new Scanner(System.in);
	private List<Student> students = new ArrayList<>();
	/*
	 * public StudentManagementSystem() { 
	 * students = new ArrayList<>(); 
	 * }
	 */

	public void getStudent(int rollNo) {
		boolean found = false;
		for(Student s:students) {
			if(s.getRollNo()==rollNo) {
				System.out.println("=================================================");
				System.out.printf("%d %-10s %d\n",s.getRollNo(),s.getName(),s.getMarks());
				System.out.println("=================================================");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student not found!");
		}
	}
	
	int maxRollNo() {
		int max=0;
		for(Student s:students) {
			if(s.getRollNo()>max) {
				max = s.getRollNo();
			}
		}
		return max+1;
	}
	public void addStudent(String name, int marks) {
		students.add(new Student(this.maxRollNo(), name, marks));
		System.out.println("Student Added successfully!");
	}

	public void removeStudent(int rollNo) {
		boolean found = false;
		for (Student s : students) {
			if (s.getRollNo() == rollNo) {
				students.remove(s);
				System.out.println("Student removed successfully!");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student not found!");
		}
	}
	
	public void updateStudent(int rollNo) {
		boolean found = false;
		for(Student s:students) {
			if(s.getRollNo()==rollNo) {
				System.out.print("\nEnter name : ");
				String name = sc.nextLine();
				s.setName(name);
				System.out.print("\nEnter marks : ");
				int marks = sc.nextInt();
				s.setMarks(marks);
				System.out.println("Student updated successfully");
				found = true;
			}
		}
		if(!found){
			System.out.println("Student not found!");
		}
	}

	public void getAllStudents() {
		if(students.isEmpty()) {
			System.out.println("No students in list!");
		} else {
			System.out.println("=================================================");
			for (Student student : students) {
				System.out.printf("%d %-10s %d", student.getRollNo(), student.name, student.getMarks());
				System.out.println();
			}			
		}
		System.out.println("=================================================");
	}
}
