package ch08;

public interface Volume {
	void volumeUp();
	void volumeDown();
	
}

class Radio implements Volume { // 인터페이스를 활용하여 다형성 구현, overriding을 이용
	public void volumeUp() {
		System.out.println("Radio Volume Up.");
	}
	public void volumeDown() {
		System.out.println("Radio Volume Down.");
		
	}
}
class TV implements Volume  {
	public void volumeUp() {
		System.out.println("TV Volume Up.");
	}
	public void volumeDown() {
		System.out.println("TV Volume Down.");
		
	}
}
class Speaker implements Volume  {
	public void volumeUp() {
		System.out.println("Speaker Volume Up.");
	}
	public void volumeDown() {
		System.out.println("Speaker Volume Down.");
		
	}
}
