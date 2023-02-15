package ch02;

public class Mono1 {
	public static void main(String[] args) {
		// ++는 1증가, ++가 앞에 있으면 i1을 1증가후 출력, ++가 뒤에 있으면 현재 값을 출력후 1증가
		int i1 = 5, i2 = 5; 
		System.out.println("i1 = " + ++i1 + ", i2 = " + i2++);
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		// --는 1감소, --가 앞에 있으면 i1을 1감소후 출력, --가 뒤에 있으면 현재 값을 출력후 1감소
		System.out.println("i1 = " + --i1 + ", i2 = " + i2--);
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
	}
}
