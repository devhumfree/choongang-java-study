package ch03;
import java.util.Scanner;
public class For10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0;
		
		do {
			num = scanner.nextInt(); //지역변수
			if(num >=2 && num <= 9) {
				for(int i=0; i <=9; i++) {
					System.out.println(num + "X" + i + "=" + num*i);
				}				
			}
		}while(num !=0);
		
		System.out.println("구구단이 종료되었습니다.");
		scanner.close();
		

	}

}

