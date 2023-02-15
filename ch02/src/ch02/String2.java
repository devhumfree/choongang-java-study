package ch02;

public class String2 {
	public static void main(String[] args) {
//		데이터형이 같은 것 끼리 연산하면 결과도 같은 데이터 형
//		데이터형이 다른 것과 연산하면 결과는 범위가 넓은 데이터형 
//		2+0=>2 +2=> 4 +3=> 7+"년" 문자열이 범위가 넓다
		System.out.println(2 + 0 + 2 + 3 + "년");
//		"년" +2=> "년2"+0=> "년20" +2=>"년202" +3=> "년2023"
		System.out.println("년" +2 + 0 + 2 + 3);
	}
}
