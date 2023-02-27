package ch07;

public class Car3 {
	String color = "Blue";
	void drive() {
		System.out.println("Let's go");
	}
}
class FireEngine3 extends Car3 {
	String color = "Red";
	void drive() {
		System.out.println("with water");
	}
	void fire() {
		System.out.println("Let's Extinguish");
	}
}
class Ambulance3 extends Car3 {
	String color = "white";
	void drive() {
		System.out.println("with patient");
	}
}
class Bus3 extends Car3 {
	void drive() {
		System.out.println("45 people");
	}
}