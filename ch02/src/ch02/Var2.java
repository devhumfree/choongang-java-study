package ch02;

public class Var2 {

	public static void main(String[] args) {
		int i1 = 34, 
			i2 = 456; // 데이터형이 같을 때는 묶어서 사용 가능
		byte b1 = 34;
		
		System.out.println(i1);
		System.out.println(b1);
		System.out.printf("%d + %d = %d\n", i1, i2, i1+i2);
		System.out.printf("%d - %d = %d\n", i1, i2, i1-i2);
		System.out.printf("%d * %d = %d\n", i1, i2, i1*i2);
		System.out.printf("%d / %d = %d\n", i2, i1, i2/i1);
	}

}
