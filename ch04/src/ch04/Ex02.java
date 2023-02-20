package ch04;
public class Ex02 {

	public static void main(String[] args) {
		int[][] arr = {{5, 5, 5, 5, 5}, {10, 10, 10, 10, 10},
						{20, 20, 20, 20, 20}, {30, 30, 30, 30, 30}};
		int sum = 0, total = 0;
		// 행별합계, 총합계

		for(int[] col : arr){
			for(int val : col) {
				sum += val;
				total +=val;
			}
			System.out.print("행별합계: "+sum+"\t");
			sum = 0;
		}
		System.out.println();
		System.out.print("총합계: "+total+"\t");

	}

}
