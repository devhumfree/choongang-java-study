package ch04;
import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		int temp = 0;
		System.out.println("번호 몇개를 고정 시킬까요");
		int num = sc.nextInt();

		for (int i = 0; i<num;i++){
			System.out.println("원하는 번호?");
			lotto[i] = sc.nextInt();
			// lotto[i] = (int)(Math.random()*45) + 1;
			
			// 로또 번호가 발생되면 앞에 같은 숫자가 있는지 확인하고 있으면 취소
			for(int j = i-1; j>=0; j--){
				if(lotto[i] == lotto[j]){
					i--; //현재 인덱스 로또 번호를 취소
					break;
				}
			}
		}
		for(int i = 0; i <lotto.length;i++){
			for(int j =i+1; j<lotto.length; j++){
				if(lotto[i] > lotto[j]) {
					temp = lotto[i]; lotto[i] = lotto[j]; lotto[j] =temp;
				}
			}
		}
		for(int i = 0; i < lotto.length;i++){
			System.out.println(lotto[i]);
		}
	}

}
