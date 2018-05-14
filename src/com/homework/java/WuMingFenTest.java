package com.homework.java;



public class WuMingFenTest {

	public static void main(String[] args) {
		WuMingFen xioming =new WuMingFen("牛肉",3,true);
		xioming.check();
		WuMingFen wo =new WuMingFen("牛肉",2);
	     wo.check();
	     WuMingFen ni =new WuMingFen();
	      ni.check();
	}

}
