package ch08;

public class Person {
	int leg = 2;
	void move() {
		System.out.println("walking");
	}
	public static void main(String[] args) {
		Mermaid mm = new Mermaid();
		mm.move(); mm.swim();
		System.out.println("number of legs: "+ mm.leg);
	}
}

interface Fish {
	void swim();
}

class Mermaid extends Person implements Fish {
	public void swim() {
		System.out.println("swimming!!!");
	}
	
}

interface Bird {
	void eat();
}












