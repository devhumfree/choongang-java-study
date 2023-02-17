package ch03;

import java.io.IOException;

public class Do6 {
	public static void main(String[] args) throws IOException {
		int i = 1, j = 2;
		System.out.println("구구단");
		do {
			do {
				System.out.printf("%d * %d = %d\t", j,i,j*i);
				j++;
			}while(j<=9);
			System.out.println();
			i++;
			j=2;
		}while(i <= 9);

	}

}
