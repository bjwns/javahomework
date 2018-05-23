package com.homework2;

import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		StudentManager studentManager= new StudentManager(2);
		Scanner scanner =new Scanner(System.in);
		while (true) {
			  System.out.println("1.新增学生");
		      System.out.println("2.显示所有学生");
		      System.out.println("3.退出");
		      System.out.println("请选择:[1 2 3]");
		      int choose = scanner.nextInt();
		      if(choose == 1) {
		    	  studentManager.add();
		      }else if(choose == 2) {
		    	  studentManager.app();
		      }else if (choose ==3) {
		    	  System.exit(0);
		      }
		      
		}
		
		
	}
	
}