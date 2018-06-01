package com.homework2;

public class ChockPalain {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("aaab");
		String a=sb.toString();
		System.out.println(a);
		sb.reverse();
		if (a.equals(sb.toString())) {
			System.out.println(sb+"这是一个回文串");
		}else {
			System.out.println(sb+"这不是一个回文串");
		}
	}

}
