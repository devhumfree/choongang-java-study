package ch08;

public class CarEx {
	public static void main(String[] args) {
		Car[] c = new Car[3];
		c[0] = new FireEngine();
		c[1] = new Bus();
		c[2] = new Taxi();
		
		for(Car i : c) {
			i.drive();
		if(i instanceof FireEngine) {
			((FireEngine)i).fire(); // downcasting
		}
		}
	}
}
