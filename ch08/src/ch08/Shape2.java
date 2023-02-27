package ch08;
// 메서드 중에 하나라도 추상메서드가 있으면 추상클래스
// 추상클래스는 객체를 생성할 수 없음, 추상 클래스를 만들어서 사용
public abstract class Shape2 {
	void disp() { // 선언
		System.out.println("Good day"); // 구현부 
	}
	// 메서드 앞에 abstract를 붙이면 추상메서드
	abstract void drive(); // 선언부는 있지만 구현부가 없다
}
class Rectangle2 extends Shape2 {
	@Override
	void drive() {
		System.out.println("사각형을 그린다.");
	}
}
class Circle2 extends Shape2 {
	@Override
	void drive() {
		System.out.println("원을 그린다.");		
	}
}
class Triangle2 extends Shape2 {
	@Override
	void drive() {
		System.out.println("삼각형을 그린다.");		
	}
}