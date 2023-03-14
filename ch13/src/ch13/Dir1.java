package ch13;

import java.io.File;

public class Dir1 {
	public static void main(String[] args) {
//		File dir = new File("."); // javaSrc/ch13
//		File dir = new File("src/ch13");
//		File dir = new File("../ch12/src/ch12");
		File dir = new File("../ch09/src/ch09");  // 9장의 소스
		String[] strs = dir.list();
		for(String str: strs) {
			System.out.println(str);
		}
	}
}