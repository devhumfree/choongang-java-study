package ch16;

import java.util.stream.IntStream;

public class FromInt2 {
	static int sum = 0;
	public static void main(String[] args) {
//		IntStream.range(1, 100); // 1부터 100 앞까지 즉 1부터 99까지
//		1부터 100까지 함 rangeClosed(1,100) 100포함
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		
		stream.forEach(x -> sum +=x);
		System.out.println("합계: " + sum);
	}
}
