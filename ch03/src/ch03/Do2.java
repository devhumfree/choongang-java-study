package ch03;

public class Do2 {

	public static void main(String[] args) {
		int sum = 0, i = 1; // 1부터 10까지 합계 do~while
		do {
			System.out.println(sum += i);
			i++;
		}while(i<=10);
	}

}
