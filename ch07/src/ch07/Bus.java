package ch07;

public class Bus extends Car{
	public Bus(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	
	void printBus() {
		print();
		System.out.println("승객 40명 이상을 태울수 있다.");
	}
}
