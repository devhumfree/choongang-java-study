package ch06;

public class Method3 {
	public static void Hello(String name) {
		System.out.println("안녕하세요 "+ name+ "님");
	}
	public static void main(String[] args) {
		String[] group = {"김연아", "제니", "보검", "은우", "로제"};
	
		for(int i =0; i<group.length; i++) {
			Hello(group[i]);
		}
	}
}
