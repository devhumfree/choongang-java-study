package ch05;
class Car4 {
	String color; String kind; int displacement;
	// 생성자가 하나도 없으면 compiler가 자동으로 기본 생성자를 만들어 준다
	// 하나의 클래스에 생성자가 여러개 있는 경우를 생성자 overloading이라고 한다
	Car4() {}  // 기본default 생성자 매개변수가 없는 메서드
	Car4(String c) {
		color = c;
	}
	Car4(String c, String k) {
		color=c; kind = k;
	}
	Car4(String c, String k, int d) {
		color=c; kind = k; displacement = d;
	}
	
	void prn() {
		System.out.println("색깔: "+color);
		System.out.println("종류: "+kind);
		System.out.println("배기: "+displacement);
		System.out.println("================");
	}
}

public class Car4Ex {

	public static void main(String[] args) {
		Car4 c1 = new Car4(); c1.color="Red"; c1.kind="Benz"; c1.displacement = 1500;
		Car4 c2 = new Car4("Yellow"); c2.kind = "소나타"; c2.displacement = 2000;
		Car4 c3 = new Car4("Blue","악센트"); c3.displacement = 1200;
		
		c1.prn(); c2.prn(); c3.prn();
		
	}

}
