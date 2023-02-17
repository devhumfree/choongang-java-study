package ch03;

public class Do1 {

	public static void main(String[] args) {
		int i = 0;
		do { // 조건에 관계없이 일단 실행
			System.out.println("안녕" + i);
			i++;
		}while(i<10); // 조건에 참이면 계속 실행하고 거짓이면 종료

	}

}
