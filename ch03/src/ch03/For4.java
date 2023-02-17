package ch03;

import java.io.IOException;

public class For4 {

	public static void main(String[] args) throws IOException {
		System.out.println("숫자를 입력하세요.");
		int num = System.in.read() - '0';
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}
		
	}

}
