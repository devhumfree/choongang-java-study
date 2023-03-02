package ch08;

public class Tv1 implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("turn on the TV");
		
	}

	@Override
	public void turnOff() {
		System.out.println("turn off the TV");
		
	}

}

class Radio1 implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("turn on the Radio");
		
	}

	@Override
	public void turnOff() {
		System.out.println("turn off the Radio");
		
	}

}
