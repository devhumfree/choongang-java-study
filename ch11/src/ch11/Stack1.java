package ch11;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		String[] nations = {"America","China","Korea","English","Aussie","japan"};
		Stack<String> stack = new Stack<>();
		for(String nation:nations) {
			stack.push(nation); // 데이터 저장
		}
		while(!stack.isEmpty()) { // 데이터가 없으면 종료
			System.out.println(stack.pop());
		}
	}
}
