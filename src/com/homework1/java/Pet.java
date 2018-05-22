package com.homework1.java;

public class Pet {
	private String name;
	private int age;
	private String gender;
	private String partner;
	  public Pet() {
	
	}
	  
public Pet(String name, int age, String gender, String partner) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
	}

public void show() {
	System.out.println("姓名:"+name+"  "+"年龄:"+age+" "+"性别:"+gender+"  "+"婚否:"+partner);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getPartner() {
	return partner;
}

public void setPartner(String partner) {
	this.partner = partner;
}
    
    	 
     }
