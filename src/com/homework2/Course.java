package com.homework2;

import java.util.Random;
import java.util.Scanner;

public class Course {

	public static void main(String[] args) {
		while(true) {
		
			Scanner sc  =new Scanner(System.in);
			System.out.println("请输入一个英文字母：");
			String i =sc.nextLine();
		  Random random = new Random();
		  String str = "";
		
			int randNum = random.nextInt(26) + 65;
			str += (char) randNum;
			System.out.println(str);
			
			
			
			if(i.equals(str)) {
				
				System.out.println("猜中了");
				break;
			}else {
				System.out.println("请重新输入：");
				return;
				
			}
		
		}
	}
}

