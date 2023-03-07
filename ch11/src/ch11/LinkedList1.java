package ch11;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> snakes = new LinkedList<>();
		snakes.add("구렁이"); snakes.add("팔렁이"); snakes.add("구렁삼");
		snakes.add("팔렁사"); snakes.add("구렁이");
		
		prn(snakes);
		snakes.add(1,"구렁오"); // index 1에 구렁이 추가, 1에 데이터가 들어가면서 index 뒤로 이동
		prn(snakes); 
		snakes.set(4, "도마뱀"); // 인덱스 5번째 값을 변경
		prn(snakes); 
		snakes.remove(2); // 해당하는 인덱스를 지우면 뒤는 인덱스가 하나씩 당겨진다
		prn(snakes);
		snakes.remove("구렁이"); // 처음 발견된 구렁이를 지우고 인덱스가 하나씩 당겨진다
		prn(snakes);
	}

	private static void prn(LinkedList<String> snakes) {
		for(String snake : snakes) {
			System.out.print(snake+"\t");
		}
		System.out.println();
		
	}

}
