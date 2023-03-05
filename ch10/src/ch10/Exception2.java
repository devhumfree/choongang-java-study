package ch10;
import java.util.Scanner;
public class Exception2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		while(true) {
			System.out.println("첫번째 숫자를 입력하시오.");
			String str = sc.nextLine();
			if(str.equals("x")) break;
			try {
				num1 = Integer.parseInt(str);
				System.out.println("두번째 숫자를 입력하세요");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d / %d = %d\n", num1,num2,num1/num2);
				
			}catch (ArithmeticException e) { //0으로 나누는경우
				System.out.println("영으로 못나눔"); 
			}catch (NumberFormatException e) { // 문자열을 숫자로 바러 갈때
				System.out.println("숫자가 아님");
			}catch (Exception e) { // 혹시다른에러, 범위가 넓은 것은 뒤에 배치를 권장
				System.out.println(e.getMessage());
			} finally { // 예외 여부와 관계없이 무조건 실행하는 명령어
				System.out.println("난 무조건 실행");
			}
		}
		sc.close();
		System.out.println("close");
	}
}
