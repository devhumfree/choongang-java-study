package ch02;

public class Ex02 {

	public static void main(String[] args) {
		int num = 456;
//		456/100 => 4(int/int => int) * 100 =>400
//		456으로 하려면 num을 float으로 형변환
		System.out.println(num/100*100);
		System.out.println(num*100/100);
		System.out.println((int)((float)num/100*100));

	}

}
