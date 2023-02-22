package ch06;

public class Method2 {
	static void cal(int x, int y) { // %d 정수
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d * %d = %d\n",x,y,x*y);
	}
	
	static void cal(double x, double y) { // %f 실수
		System.out.printf("%f + %f = %f\n",x,y,x+y);
		System.out.printf("%f * %f = %f\n",x,y,x*y);
	}
	
	public static void main(String[] args) {
//		Method2 m2 = new Method2();
		for (int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * 10) + 1;
			int y = (int)(Math.random() * 10) + 1;
			cal(x, y); // 사용하려는 클래스명과 main으로 실행하는 클래스명이 일치할때는 클래스명 생략가능
			double a = Math.random() * 10;
			double b = Math.random() * 10;
			cal(a, b);
			
		}
	}
}
