package ch08;

public interface RemoteControl {
	// interface의 상수 public static final이 생략, 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// interface의 메서드는 PUBLIC ABSOLUTE가 생략
	void turnOn();
	void turnOff();
	// default method는 구현부를 만들 수 있다
	default void setMute(boolean mute) {
		if(mute) System.out.println("It's mute");
		else System.out.println("no mute");
 	}
	// static method도 구현부를 만들 수 있다
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
