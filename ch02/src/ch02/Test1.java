package ch02;

public class Test1 {
	public static void main(String[] args) {
		//IEEE 754 부동 소수점 방식으로 계산해서 저렇게 나오는 것이다
		// 실수는 부동 소수형 근사값 10의 -15승 차이는 날 수 있다
		System.out.println(0.1+0.2);
		// 선언    대입
		// 수학에서 =은 같다. 자바에서는 = 대입 오른쪽 57을 변수 il에 대입
		// 자바에서 같음을 의미 ==
		int il = 57;
		byte b1 = 114; // byte -128 ~ 127
		
		System.out.println(il);
		System.out.println(b1);
	}
}
