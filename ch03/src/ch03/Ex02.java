package ch03;

public class Ex02 {

	public static void main(String[] args) {
//		1+(1+2)+(1+2+3)+……..+(1+2+3+4+5+….9+10)
		int sum=0, totalSum=0;
		
		for(int i = 1; i<=10; i++) {
			sum +=i;
			totalSum += sum;
			System.out.println(sum);			
		}
		System.out.println("----------");
		System.out.println(totalSum);
		
	}

}
