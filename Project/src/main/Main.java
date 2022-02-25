package main;

import domain.Car;

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car.Builder("VolksWagen", "Golf 6" , 5).color("Blue").build();
		System.out.println(c);
		c.start();
		System.out.println(c);

	}

}
