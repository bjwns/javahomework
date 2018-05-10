package com.homework.java;

public class Student {
           String name ;
           String interest;
           String TakeCourses;
           int age ;
	public  void show() {
		// TODO Auto-generated method stub
		    System.out.println("展示学员信息：");
		    System.out.println("姓名："+name);
            System.out.println("兴趣："+interest);
            System.out.println("参加的课程:"+TakeCourses);
            System.out.println("年龄:"+age+"\n");
            
	}
	  public  void behavior() {
		  System.out.println("展示教练信息：");
		  System.out.println("姓名："+name);
          System.out.println("专业方向："+interest);
          System.out.println("教的课程:"+TakeCourses);
          System.out.println("年龄:"+age);
	}
	
}


