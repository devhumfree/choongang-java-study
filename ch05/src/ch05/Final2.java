package ch05;
import java.util.Scanner;

public class Final2 {
	public static void main(String[] args) {
//		final은 값 변경금지, 대문자로 표시
//		final은 프로그램 이해가 쉽
		final int TRIANGLE = 1;
		final int RECTANGLE = 2;
		final int CIRCLE = 3;
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("1/2/3중에서 숫자를입력하세요");
			num = sc.nextInt();
			if(num == TRIANGLE) System.out.println("삼각형입니다.");
			else if(num == RECTANGLE) System.out.println("사각형입니다.");
			else if(num == CIRCLE) System.out.println("원입니다.");
			else System.out.println("1,2,3 중 에서 입력하시오");
		}while(num != 0);
		System.out.println("끝났음");
		sc.close();
	}
}
