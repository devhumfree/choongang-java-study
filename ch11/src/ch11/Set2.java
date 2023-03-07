package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
	public static void main(String[] args) {
//		산딸기, 판딸기, 산딸기, 죽은딸기, 알카리딸기, 죽은딸기
//		확장 for문 Iterator를 사용하여 출력
		HashSet<String> berries = new HashSet<>();
		berries.add("산딸기"); berries.add("판딸기"); berries.add("산딸기");
		berries.add("죽은딸기"); berries.add("알카리딸기"); berries.add("죽은딸기");
		
		System.out.println("size: " + berries.size());
		
		Iterator<String> it = berries.iterator();
		while(it.hasNext()) { // 중복쓰 제거
			System.out.println(it.next());
		}
		
	}
}
