package ch04;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		//  Scanner를 이용하여 4자리 정수를 받고 year
		//  400나누어서 떨어지면 윤년, 4로 나누어서 떨어지고 100으로 나누어서 안떨어지면 평년

		Scanner in = new Scanner(System.in);

		do {
		System.out.println("입력하쇼");
		
		int num = in.nextInt();
 //		&&가 || 보다 우선 순위가 높음
		if (num == 0) break;

		else if(num % 400 == 0 || num % 4 == 0 && num % 100 != 0)
			System.out.println("윤년쓰: " + num);
		else System.out.println("평년쓰: " + num);
		}while(true);

		System.out.println("Program End");
		in.close();

	}

}
