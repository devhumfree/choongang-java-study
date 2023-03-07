package ch11;

import java.util.*;

public class set1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Apple"); set.add("Grape"); set.add("Apple");
		set.add("kiwi"); set.add("banana"); set.add("banana");
		
		System.out.println("longs: " + set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()) { // 중복쓰 제거
			System.out.println(it.next());
		}
		System.out.println("=====================");
		for(String str : set) {
			System.out.println(str);
		}
	}

}
