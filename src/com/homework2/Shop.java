package com.homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Shop {
      public static Date nextSign(Date str1,int year) {
      
      Calendar cal = Calendar.getInstance();
      cal.setTime(str1);
      cal.add(Calendar.YEAR, year);
      if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
			cal.add(Calendar.DATE, -2);
      }
      if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
			cal.add(Calendar.DATE, -1);
      }
      if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY){
			cal.add(Calendar.DATE, 0);
      }
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY){
				cal.add(Calendar.DATE, -6);
			}
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY){
					cal.add(Calendar.DATE, -5);
			}
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY){
						cal.add(Calendar.DATE, -4);
			}
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY){
							cal.add(Calendar.DATE, -3);
			}
			return cal.getTime();
      }
      
      
	public static void main(String[] args) {
		String str ="2017-8-26";
		int year =1;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		try {
			Date next = nextSign(sdf.parse(str),year);
			System.out.println("商品的促销时间："+sdf.format(next));
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		

	}

}
