package ch03;

public class while2 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
//		while문을 이용하여 1부터 10까지 합계
		while(i < 11) {
			sum +=i;
			i++;
		}
		System.out.println(sum);
	}

}
