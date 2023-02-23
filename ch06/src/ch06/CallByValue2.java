package ch06;
class B1 {
	void m1(int x, int y) { // x =10, y= 20
		x += 7;
		y += 5;
		System.out.println("m1 x = "+x);
		System.out.println("m1 y = "+y);
	}
}

public class CallByValue2 {
	public static void main(String[] args) {
		B1 a1 = new B1();
		int x=10, y=20; //데이터가 기본인 경
		a1.m1(x, y); // 값 10, 20을 전달한 것이지 변수 x,y를 전달한 것이아님
		System.out.println("main x = "+ x);
		System.out.println("main x = "+ y);
	}
}
