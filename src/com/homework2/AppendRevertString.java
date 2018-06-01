package com.homework2;

import java.util.Scanner;

public class AppendRevertString {
	public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("请输入一个字符串：");
	     String str =sc.nextLine();
	    
	     StringBuffer str1 =new StringBuffer(str);
	     str1.reverse();
        str1.insert(0,str);
        str1.delete(4,6);
        System.out.println(str1);
	
	}
	
}
