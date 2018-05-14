package com.homework.java;

public class MyTime {
     private int hour;
     private int minute;
     private int second;
     public MyTime(int hour,int minute,int second) {
    	 this.hour =hour;
    	 this.minute =minute;
    	 this.second =second;
    	 }
     public void display() {
    	 System.out.println("现在时间:"+hour+":"+minute+":"+second);
     
       
     }
	public void addSecond(int sec) {
		this.second =second+sec;
		if (second>59) {
			second -= 60;
			minute += 1;
			if (minute>59) {
				minute -= 60;
				hour += 1;
				if (hour>23) {
					hour -= 24;
					
				}
			}
		}
		
			
		}public void addMinute(int min) {
			this.minute =minute+min;
			if (minute>59) {
				minute -= 60;
				hour += 1;
				if(hour>23) {
					hour -= 24;
					
				}
			}
		}
		public void subHour(int hou) {
			this.hour += 1;
			if (hour>23) {
				hour -= 24;
			}
		}
		
		
		
	}
     


