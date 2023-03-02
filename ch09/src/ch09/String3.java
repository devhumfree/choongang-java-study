package ch09;

public class String3 {
	public static void main(String[] args) {
		String str = "우리는 친구였어, 곁에 있으면 든든한 친구";
		
		System.out.println(str.substring(5, 10)); // 인덱스 5 부터 10 이전까지
		System.out.println(str.substring(7)); // 인덱스 7부터 끝까지
		System.out.println(str.indexOf("친")); // '친'이라는 글자의 인덱스 앞에서부터
		System.out.println(str.lastIndexOf("친")); // '친'이라는 글자의 인덱스 뒤에서부터
		System.out.println(str.startsWith("우")); // '우'로시작하는지
		System.out.println(str.endsWith("친")); // '친'으로 끝나는지
		System.out.println(str.contains("대")); // '대'라는 글자 포함
		String[] arr = str.split(" ");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(str.length());
	}

}
