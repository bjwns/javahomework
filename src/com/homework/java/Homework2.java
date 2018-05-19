package com.homework.java;

public class Homework2 {

	public static void main(String[] args) {
		State p =new State();
		System.out.print("显示第一个人的基本信息：");
		p.showMessage();
		
		p =new State("美国");
		System.out.print("显示第二个人的基本信息：");
		p.showMessage();
		p.showState();
		
		
		
		
		

	}

}
