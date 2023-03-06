package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {
	public static void main(String[] args) {
		ArrayList<String> berries = new ArrayList<>(); 
		berries.add("산딸기");
		berries.add("집딸기");
		berries.add("죽은딸기");
		berries.add("알카리딸기");
		berries.add("산딸기");
		
		for(int i = 0; i<berries.size(); i++) {
			System.out.print(berries.get(i)+"\t");
		}
		System.out.println();
		for(String str : berries) {
			System.out.print(str+"\t");
		}
		System.out.println();
		Iterator<String> its = berries.iterator();
		while(its.hasNext()) { // 가져올 다음 데이터 있냐
			System.out.print(its.next()+"\t"); // 다음 데이터
		}
	}
}
