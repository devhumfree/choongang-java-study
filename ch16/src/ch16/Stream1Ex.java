package ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1Ex {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("Rose"); list.add("Jenny"); list.add("Boston");
		List<String> list = Arrays.asList("Rose","Jenny","Boston");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("=======================");
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
