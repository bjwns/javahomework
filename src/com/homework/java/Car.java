package com.homework.java;

public class Car {
	private String color;
	private String model;
	public Car() {
		this.color ="红色";
		this.model ="轿车";
	}
	public Car(String color, String model) {
		
		this.color = color;
		this.model = model;
	}
	
	public void showColor() {
		System.out.println("车的颜色："+color);
	}
    public void showModel() {
    	System.out.println("车的类型："+model);
	}
	

}
