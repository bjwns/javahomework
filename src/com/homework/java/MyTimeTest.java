package com.homework.java;

public class MyTimeTest {

	public static void main(String[] args) {
		MyTime mytime =new MyTime(11,59,59);
		mytime.display();
		
		 mytime =new MyTime(23,59,59);
		mytime.addSecond(1);
		mytime.display();
		
		 mytime =new MyTime(23,59,59);
		mytime.addMinute(1);
		mytime.display();
	
		mytime =new MyTime(23,59,59);
		mytime.subHour(1);
		mytime.display();
	
	}

}
