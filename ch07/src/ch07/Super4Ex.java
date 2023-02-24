package ch07;
class H1 {
	int x;
	H1(int x) { // 8
		this.x = x;  // 9
		System.out.println("parent's parameter 1"); // 10
	}
	H1(int x, int y) { // 6
		this(x);       // 7
		System.out.println("parent's parameter 2"); // 11
	}
	void print() {
		System.out.println("x:: " + x);
	}
}

class H2 extends H1 {
	H2(int x, int y) { // 4
		super(x, y);  // 5
		System.out.println("child's parameter 2"); // 12
	}
	H2(int x, int y, int z) { // 2
		this(x,y);            // 3
		System.out.println("child's parameter 3"); // 13
	}
}
public class Super4Ex {
	public static void main(String[] args) {
		H2 h = new H2(34, 66, 55);
		h.print();
	}
}
