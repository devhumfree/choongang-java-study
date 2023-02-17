package ch03;

import java.io.IOException;

public class while4 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고 싶은 구구단 번호를 입력하세요.");
		int num = System.in.read() - '0';
		System.out.println("구구단"+num+"단");
		int i = 1;
		
		while(i < 10) {
			System.out.println(num + "X" + i + "=" + num*i);
			i++;
		}
		
	}

}
