package com.homework2;

import java.util.Calendar;
import java.util.Scanner;

public class Datey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year =sc.nextInt();
		
		Calendar cal =Calendar.getInstance();
		
		for(int month=1;month<=12;month++) {
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,1);
	
		int maxday =cal.getActualMaximum(Calendar.DAY_OF_MONTH)	;
		
		int weekday =cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("\t\t"+year+"年"+month+"月的日历");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		  
		for(int i=1;i<weekday;i++) {
			System.out.print("\t");
		}
			for(int i=1;i<=maxday;i++) {
				System.out.print(i+"\t");
				if((weekday+i-1) %7 == 0) {
					System.out.println();
				}
			}
		
			System.out.println();
		
		
		}
		
	}
}
