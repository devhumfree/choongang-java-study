package ch03;

public class For3 {

	public static void main(String[] args) {
//		1 ~ 100사이의 짝수합, 홀수 합, 전체합
		int sum_even = 0, sum_odd = 0;
		
		for(int i =1; i<=100; i++) {
			if(i % 2 ==0) {
				sum_even += i;
			}else {
				sum_odd +=i;
			}
				
		}
		System.out.printf("짝수의 합은 %d\n", sum_even);
		System.out.printf("홀수의 합은 %d\n", sum_odd);
		
		System.out.printf("둘의 총 합은 %d\n", sum_even+sum_odd);
	
	}

}
