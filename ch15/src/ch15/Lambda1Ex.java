package ch15;
@FunctionalInterface // 함수적 인터페이스인지 확인
interface MyFunction1 {
	public void method1(); // 추상 메서드가 한개!
}
class MyFunction1Class implements MyFunction1 {
	public void method1() {
		System.out.println("재정의한 함수");
	}
}
public class Lambda1Ex  {
	public static void main(String[] args) {
		MyFunction1 mf1 = new MyFunction1Class();
		mf1.method1();
//		클래스명 Lambda1Es$1
		mf1 = new MyFunction1() {

			public void method1() {
				System.out.println("인터페이스를 직접 재정의");
			}
		};
		
		mf1.method1();
		
//		Lambda를 이용하는 방법
		mf1=() -> {System.out.println("람다식 메서드"); };
		mf1.method1();
	}
}
