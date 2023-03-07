package ch06;
class B2 {
	void m1(int a, int b) { // x =10, y= 20
		int temp;
		temp = a; a = b ;
		b= temp;
		System.out.println("main x"+a);
		System.out.println("main y"+b);
	}
}

public class CallByValue1 {
	public static void main(String[] args) {
		B2 a1 = new B2();
		int x=10, y=20; //데이터가 기본인 경
		a1.m1(x, y); // 값 10, 20을 전달한 것이지 변수 x,y를 전달한 것이아님
		System.out.println("main x = "+ x);
		System.out.println("main y = "+ y);
	}
}
