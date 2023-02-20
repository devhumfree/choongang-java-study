package ch04;
public class TwoArr2 {

	public static void main(String[] args) {
//		국  영  수 과
//		88 99 88 77
//		56 88 76 92
//		92 87 90 82
		
//        0열  1열  2열
int[][] score = {{88, 99, 88,77}, // 1행
				{56, 88, 76, 92}, // 2행
				{92, 87, 90, 82}}; // 3행

	System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
	System.out.println("------------------------------------------");
	int sum = 0;

	for(int i = 0; i<score.length; i++) {
		for(int j=0; j<score[i].length; j++) {
			System.out.print(score[i][j] + "\t");
			sum +=score[i][j];
		}
			System.out.println(sum+"\t"+sum/score[i].length);
			sum = 0; // 한줄을 출력후에 다시 sum을 clear
		}
	}

}
