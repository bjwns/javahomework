package com.homework.java;

public class WuMingFen {
	private String theMa;
	private int quantity ;
	private boolean likeSoup;
						
	
	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	public WuMingFen(String theMa, int quantity) {
		
		this.theMa = theMa;
		this.quantity = quantity;
		
	}
	public  WuMingFen() {
		this.theMa = "酸辣面粉";
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
		
	
	public void check() {
		System.out.println(theMa+quantity+likeSoup);
	}
	
	

}
