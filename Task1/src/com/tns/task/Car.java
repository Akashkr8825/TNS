package com.tns.task;

public class Car extends Vehicle {

	@Override
	public void numberOfWheels() {
      System.out.println("4-Wheels");		
	}

	@Override
	public void color() {
		System.out.println("Red");
	}

}
