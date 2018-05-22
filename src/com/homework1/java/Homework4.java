package com.homework1.java;

public class Homework4 {
	public static void main(String[] args) {
    Pet cat1 =new Pet();
    //cat1.show();
    cat1.setName("老王");
    
    cat1.setAge(5);
    
    cat1.setGender("男");
   
    cat1.setPartner("无配偶");
    
    
    String name=cat1.getName();
    int age=cat1.getAge();
    String gender=cat1.getGender();
    String partner=cat1.getPartner();
    
    Pet cat2 =new Pet();
    //cat2.show();
    cat2.setName("小王");
    
    cat2.setAge(5);
    
    cat2.setGender("女");
   
    cat2.setPartner("无配偶");
    
    
    String name1=cat2.getName();
    int age1=cat2.getAge();
    String gender1=cat2.getGender();
    String partner1=cat2.getPartner();
	   if(gender != gender1 &&partner.equals("无配偶")&&partner1.equals("无配偶") &&age>=5&&age1>=4) {
		   System.out.println("可以结婚");
	   }
	   else {
		   System.out.println("不可以结婚");
	   }
	}
	}
   
