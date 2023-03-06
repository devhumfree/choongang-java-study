package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array4 {
	public static void main(String[] args) {
		ArrayList<String> berries = new ArrayList<>(); 
		berries.add("산딸기");
		berries.add("집딸기");
		berries.add("죽은딸기");
		berries.add("알카리딸기");
		berries.add("산딸기");
		
		prn(berries);
		berries.add(2, "뱀딸기");
		prn(berries);
		berries.set(4, "인삼딸기");
		prn(berries);
		berries.remove(1);
		prn(berries);
		berries.remove("산딸기");
//		prn(berries);
		System.out.println(berries);
	}

	private static void prn(ArrayList<String> berries) {
		for(String berrie : berries) {
			System.out.print(berrie + "\t");
		}
		System.out.println();
	}
}
