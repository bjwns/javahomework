package com.homework.java;



public class VehicleTest {

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.setSpeed( 100);
		car.setSize(2500);
		car.show();
		
		car.move();
		car.SetSpeed(100);
		car.speedUp();
		car.speedDown();
	}	
}
