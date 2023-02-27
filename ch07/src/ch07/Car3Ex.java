package ch07;

public class Car3Ex {
	public static void main(String[] args) {
//		부모를 선언하고 자식을 생성; 범위가 작은 곳에서 넓은 곳 upcasting 묵시
		Car3 car1 = new FireEngine3();
		Car3 car2 = new Ambulance3();
		Car3 car3 = new Bus3();
//		부모를 선언하고 자식을 생성하여 대입하면 부모가 가지고 있는 메서드와 멤버변수만 사용 가능
//		실제로 실행되는 내용은 자식메서드
		car1.drive(); car2.drive(); car3.drive(); //car1.fire();
		System.out.println("========================");
		Car3[] cars = {car1, car2, car3};
		for(Car3 car : cars) {
			// 변수는 부모의 값이 실행, 변수는 이름은 같지만 다른 변수로 인식
			System.out.println(car.color);
			car.drive(); // 메서드는자식 메서드가 사용
//			원래 FireEngine3였던 car는 에러가 발생하지 않지만 다른 경우에는 에러 발생
//			FireEngine3 fe = (FireEngine3)car;
//			fe.fire();
			if(car instanceof FireEngine3) // 현재 car가 FireEngine3d에서 온 것인지 확인
			((FireEngine3)car).fire(); // 두줄을 한줄로 간편하게 변경
		}
	}
	
}

