package ch03;

import java.io.IOException;

public class Do4 {
	public static void main(String[] args) throws IOException {
		System.out.println("보고 싶은 구구단 번호를 입력하세요.");
		int num = System.in.read() - '0';
		int i = 1;
		do {
			System.out.println(num + "X" + i + "=" + num * i);
			i++;
		} while(i <= 9);
	}

}
