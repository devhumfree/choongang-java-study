package ch04;

public class Arr6 {

	public static void main(String[] args) {
		String[] snake = {"구렁이", "팔렁이", "칠렁이", "육렁이", "구렁삼", "구렁사"};
		
	for(String str : snake) {
		System.out.println(str);
	}
	System.out.println("-------------------");
	for(int i = 0; i < snake.length; i++) {
		System.out.println(snake[i]);
	}
	}

}
