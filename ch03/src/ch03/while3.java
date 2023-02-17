package ch03;

import java.io.IOException;

public class while3 {

	public static void main(String[] args) throws IOException {
		System.out.println("한자리 정수를 입력하세요.");
//		콘솔로부터 데이터를 한글자만 읽는다.
//		입력한 문자하나를 유니코드 값으로 인식
		int num = System.in.read() - '0';
		System.out.println("입력한 정수: " + num);
	}

}
