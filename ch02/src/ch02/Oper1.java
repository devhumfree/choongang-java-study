package ch02;

public class Oper1 {
	public static void main(String[] args) {
		char c1 = 'a'; // 97
		System.out.println("c1 = " + c1); // 98
		char c2 = (char)(c1+1);
		System.out.println("c2 = " + c2);
		int i1 = c1 + 1;
		System.out.println("i1 = " + i1);
		int i2 = 'k' - 'j'; // 간격 1
		System.out.println("i2 = " + i2);
//		연산자를 만나면 문자가 숫자로 변경되어 연산
		int i3 = 10 - '0'; // '0'숫자가 유니코드로 변경되고 이 48, 10 - 48=> -38
		System.out.println("i3 = " + i3);
		
	}
}
