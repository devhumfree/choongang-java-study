package ch09;

public class String1 {
	public static void main(String[] args) {
		String str1 = "java"; // 기본형처럼 사용
		String str2 = "java";
		String str3 = new String("java"); // 참조형처럼 사용
		
		if(str1.equals(str2)) System.out.println("1, 2 same");
		else System.out.println("eq 1, 2 NOT SAME");
		if(str1.equals(str3)) System.out.println("1, 3 same");
		else System.out.println("eq 1, 3 NOT SAME");
		System.out.println("================================");		
		if(str1==str2) System.out.println("1, 2 same");
		else System.out.println("1, 2 NOT SAME");
		if(str1 == str3) System.out.println("1, 3 same");
		else System.out.println("1, 3 NOT SAME");
	}
}
