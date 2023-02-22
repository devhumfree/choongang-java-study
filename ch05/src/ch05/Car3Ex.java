package ch05;
class Car3 {
	static String color;
	static String kind; // 공통으로 사용 가능, 클래스 변, 로딩할때 실
	int displacement;  //객체를 생성해야 사용가능, 인스탄스 변수, 인스턴스 변수
	
	void prn() {
		System.out.println("색깔: "+color);	
		System.out.println("종류: "+kind);	
		System.out.println("배기량: "+displacement);	
		System.out.println("======================");	
	}
}

public class Car3Ex {
	public static void main(String[] args) {
		Car3 c1 = new Car3(); Car3 c2 = new Car3();
		Car3.color = "핑쿠";
//		c1.color = "빨강"; 
		c1.displacement = 1500; c1.kind="Benz";
		c2.displacement = 2000;
		
		c1.prn();
		c2.prn();
		
		
	}

}
