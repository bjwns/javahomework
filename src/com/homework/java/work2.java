package com.homework.java;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input =new Scanner(System.in);
      System.out.println("请输入一个年份:");
      int year = input.nextInt();
    if (year %400==0 ) {
    	System.out.println("这是一个闰年");
    }else if (year %4==0&&year %100 !=0 ) {
    	System.out.println("这是一个闰年");
    }else {
    	System.out.println("这不是一个闰年");
    }
	
    }

}
