package ch11;
import java.util.*;
public class Queue1 {
	public static void main(String[] args) {
		String[] fruits = {"apple", "berry", "grape", "banana"};
		LinkedList<String> que = new LinkedList<>();
		for(String fruit:fruits) {
			que.offer(fruit);
		}
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}
