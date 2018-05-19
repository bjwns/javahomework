package com.homework.java;

public class State extends Person {
     private String name;

	public State() {
		super();
		name ="中国";
	}
      
	
	public State(String name) {
		super("哎里森","男",41);
		this.name = name;
	}
	public void showState() {
		System.out.println("此人的国籍是："+name);
	
	}
     
}
