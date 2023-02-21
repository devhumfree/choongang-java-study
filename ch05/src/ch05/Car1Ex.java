package ch05;

public class Car1Ex {
	public static void main(String[] args) {
//		객체선언		객체 생성
//		myCar: 객체명, 레퍼런스(참조)명
		Car1 myCar = new Car1();
//		객체명.멤버변수, 객체명.메서드(); 형식으로 사용
		myCar.color = "빨강"; myCar.displacement = 1500; myCar.name="소나타";
		System.out.println(myCar.color);
		System.out.println(myCar.displacement);
		System.out.println(myCar.name);
		myCar.speedUp();
		
		Car1 yourCar; // 객체선언
		yourCar = new Car1(); // 객체 생성
		yourCar.color = "hotpink";
		System.out.println(yourCar.color);
		
	}

}
