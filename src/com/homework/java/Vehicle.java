package com.homework.java;

public class Vehicle {
	private int speed ;
     private int size;
	
     
    
         
        public void show () {
        	System.out.println("车子速度："+speed+"\n"+"车子大小:"+size);}
        
         public void move() {
        	 System.out.println("车子移动了");
         }
         public void SetSpeed(int speed) {
        	 System.out.println("设置速度:"+speed);
         }
         public void speedUp() {
        	 System.out.println("车子加速20"+"速度为 "+(speed+20));
         }
         public void speedDown() {
        	 System.out.println("车子减速50"+"速度为"+(speed-50));
         }
         
	
     public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
      
         

	
         
	}      
	

