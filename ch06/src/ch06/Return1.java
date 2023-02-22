package ch06;
class A2 {
	String greeting;
	void add(int x, int y) { // 반환 할 값이 없음
		System.out.printf("%d + %d = %d\n", x, y, x+y);
	}
	int minus(int x, int y) { // 반환 할 정수값이 있음. String 반환 할 문자열이 있음
		return x - y;
	}
	String hello(String name) {
		greeting = "안녕하세요." + name + "님";
		return greeting;
	}
	
}
public class Return1 {
	public static void main(String[] args) {
		String[] group = {"김연아", "제니", "보검", "은우", "로제"};
		A2 a2 = new A2();
		int x = 56; int y = 65;
		a2.add(x, y);
//		System.out.println(a2.minus(x, y));
		int k = a2.minus(x, y);
		System.out.println(k);
		
		for(int i = 0; i<group.length; i++) {
			System.out.println(a2.hello(group[i]) );
		}
	}
}
