package com.tns.task;

public class Test {
public static void main(String[] args) {
	System.out.println("-------for Vehicle------------");
	Vehicle v=new Vehicle();
	v.numberOfWheels();
	v.color();
	System.out.println("-------for bicycle------------");
	Vehicle B=new Bicycle();
	B.numberOfWheels();
	B.color();
	System.out.println("-------for Car----------------");
	Vehicle C=new Car();
	C.numberOfWheels();
	C.color();
	System.out.println("-------for Bus----------------");
	Vehicle b=new Bus();
	b.numberOfWheels();
	b.color();
}
}
