package com.homework.java;

public class A {
	private int v =100;
	public void guess(int b) {
		if (b<v) {
			System.out.println("小了");
		}else if (b==v) {
			System.out.println("猜中了");
		}else  {
			System.out.println("大了");
		}
	}

}
