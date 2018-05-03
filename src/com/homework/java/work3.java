package com.homework.java;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner =new Scanner(System.in);
	      System.out.println("请输入一个数:");
	      int input = scanner.nextInt();
	      long sum=1;
	     for(long i=1;i<=input;i++) {
	    	 sum=sum*i;
	     }
      if(sum>0) {
	     System.out.println(sum);
      }
	}

}
