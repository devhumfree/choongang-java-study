package ch02;

public class Mono2 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 7;
		int k1 = 5 * ++i1 + (2 + i2--) * 3; // i1은 1증가하여 연산, i2는 연산이 끝난 후 1감소
		
		System.out.println("i1= "+ i1);
		System.out.println("i2= "+ i2);
		System.out.println("k1= "+ k1);
	}
}
