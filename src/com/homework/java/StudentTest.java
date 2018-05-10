package com.homework.java;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.name ="小帅";
		student.interest ="游泳";	
		student.TakeCourses ="英语";
		student.age =10;
		 student.show();
		
		 student = new Student();
		 student.name ="陈教练";
		 student.interest ="java";
		 student.TakeCourses ="英语";
		 student.age =10;
		 student.behavior();
	}
   
}
