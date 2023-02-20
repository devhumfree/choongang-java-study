package ch04;
public class Ex01 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i : arr){
			sum += i;
		}
		
		System.out.println("합: " + sum);
		System.out.println("평균: " + sum / arr.length);
	}

}
