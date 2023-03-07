package ch07;

public class CarEx {
	public static void main(String[] args) {
		Ambulance ambo = new Ambulance("ambulance", 10);
		Bus bus = new Bus("Bus", 40);
		FireEngine fire = new FireEngine("Fire-engine", 12);
		

		ambo.printAmbo();
		bus.printBus();
		fire.printFire();
		
	}
}
