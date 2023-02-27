package ch08;

public class Shape {
	void draw() {
		System.out.println("Draw");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Draw Rect");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Draw Tri");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Draw Cirle");
	}
}