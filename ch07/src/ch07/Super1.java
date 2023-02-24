package ch07;
class E1 {
	// 기본 생성자는 생성자가 하나면 없으면 컴파일 할때 만어주다. 하나라도 있으면 안만들어 준
	E1(){System.out.println("기본 생성");}
	
	E1(int k) { // 하나라도 생성자가 있으면 default생성자가 생성되지 않는다.
		System.out.println("난 매개변수가 하나인 생성자: "+k);
	}
	void m1() {
		System.out.println("대박사건");
	}
}
class E2 extends E1 {
// 특별한 것이 없으면 부모의 default 생성자를 통하여 생
	E2(int k) {// E1의 매개변수 k에 전달할 데이터가 없어서 에러
		super(k); // 기본생성자가 아닌 매개변수 1개인 생성자로 부모가 생성된 후에 자식 생성된
	}
	void m2() {System.out.println("dpa");}
	
}
public class Super1 {
public static void main(String[] args) {
	E2 e = new E2(7);
	e.m1(); e.m2();
}
}
