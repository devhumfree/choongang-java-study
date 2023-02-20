package ch04;

public class Arr10 {

	public static void main(String[] args) {
		int []a = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum = 0;
		int iMax = 0;
		int iMin = 999999;
		
		int max=a[0], min=a[0];
		
		for(int i : a) {
			sum += i;
			iMax = Math.max(i, iMax);
			iMin = Math.min(i, iMin);
			
//			if(max < a[i]) max=a[i];
//			if(min > a[i]) min=a[i];
		}
		System.out.println("합계: "+sum);

		System.out.println("평균: "+sum/a.length);
		
		System.out.println("최대값: "+iMax);
		
		System.out.println("최소값: "+iMin);
		System.out.println();
		System.out.println();
		
		int[] score2 = {76,45,34,89,98,50,90,92,77,25};
		int sum2 = 0, max2=score2[0], min2=score2[0];
		
		for(int j : score2) {
			sum2 +=j;
			if(max2 < j) max2 = j;
			if(min2 > j) min2 = j;
		}
		System.out.println("합계: "+sum2);
		System.out.println("평균: "+sum2/score2.length);
		System.out.println("최대: "+max2);
		System.out.println("최소: "+min2);
	}

}
