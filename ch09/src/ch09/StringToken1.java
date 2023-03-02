package ch09;
import java.util.StringTokenizer;

public class StringToken1 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("apple, banana, straberry, grape",",");
		while(st.hasMoreTokens()) {//토큰이 있으면 (데이터가 있으면)
			System.out.println(st.nextToken());
		}
	}
}
