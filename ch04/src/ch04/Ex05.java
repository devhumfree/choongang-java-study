package ch04;

public class Ex05 {

	public static void main(String[] args) {
		// 행별로 최대, 최소, 합계
		// 전체  최대, 최소, 합계
		int[][] score = {{67, 78, 98},{78, 98, 65},{78,56,90}};
		int sum = 0, tot = 0, max =0, min = 100, tmax = 0, tmin = 100;
		System.out.println("국어\t영어\t수학\t합계\t최대\t최소");
		System.out.println("----------------------------------------------");
		
		for(int i =0; i<score.length; i++){
			for(int j = 0; j<score[i].length; j++){
				System.out.print(score[i][j]+"\t");
				sum +=score[i][j]; tot +=score[i][j];
				if(max > score[i][j]) max = score[i][j];
				if(min < score[i][j]) min = score[i][j];
				if(tmax > score[i][j]) tmax = score[i][j];
				if(tmin < score[i][j]) tmin = score[i][j];
			}
			System.out.println(sum+"\t"+max+"\t"+min);
			sum=0; max=0; min=0;
		}
		System.out.println("----------------------------------------------");
		System.out.println("총계: "+tot+"전체최대"+max+"전체최소"+min);
		
		// for(int row[] : score){
		// 	for(int col : row) {
		// 		System.out.print(col+ "\t");
		// 		sum +=col;
		// 		System.out.print(sum+"\t");
		// 	}
		// 	sum = 0;
		// 	System.out.println();
		// }
	}

}
