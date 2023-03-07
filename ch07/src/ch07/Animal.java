package ch07;

public class Animal {
	int x = 7;
	void move() {
		System.out.println("move");
	}
}

class Pig extends Animal {
	int x = 10;
	void move() {
		System.out.println("move 4 regs");
	}
}

class Bird extends Animal {
	void move() {
		System.out.println("Fly with wing");
	}
	void eat() {
		System.out.println("eating with sharp mouse");
	}
}

class Fish extends Animal {
	void move() {
		System.out.println("swimming");
	}
}
