package com.homework2;

import java.util.Scanner;

import com.homework1.java.Student;

public class StudentManager {
	private Student[] students;

	public StudentManager(int length) {
		this.students= new Student[length];
	}
	public void add() {
		Scanner scanner =new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			System.out.println("请输入学号：");
			int id =scanner.nextInt();
			System.out.println("请输入姓名：");
			String name =scanner.next();
			
			Student student =new Student();
			student.setId(id);
			student.setName(name);
			student.setScore(student.test());
			students[i] =student;
		}
	}
	
     public void app() {
    	 for(int i =0;i<students.length;i++) {
    	  Student student =students[i];
    	  student.display();
    	 }
		
	}





}