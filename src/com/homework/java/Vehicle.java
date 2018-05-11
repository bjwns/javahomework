package com.homework.java;

public class Vehicle {
	  int speed ;
      int size;
	public void move() {
		System.out.println("车子可以移动");
	}
	public void setSpeed() {
		System.out.println("车子速度为20");
	}
	public void speedUp () {
		System.out.println("加速50时，车子速度为70");
	}
	public void  speedDown() {
		System.out.println("减速10时，车子速度为10");
	}

}
