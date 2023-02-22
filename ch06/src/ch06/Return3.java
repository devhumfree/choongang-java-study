package ch06;
public class Return3 {
	// 객체를 생성하여 사용하거나 static붙혀서 정적 변수로 만들어서 사용
	private static String greeting(String name, String words) {
		return name+" "+words;
	}
	
	public static void main(String[] args) {
		String[] name = {"로제", "제니", "은우", "보검"};
		String[] hello = {"hello", "안녕하세요", "Good Morning", "싸와디캅"};
		
		for(int i = 0; i<name.length; i++) {
			System.out.println(greeting(name[i], hello[i]));
		}
	}
}
