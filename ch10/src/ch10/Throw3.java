package ch10;

public class Throw3 {

	public static void main(String[] args) {
		int[] k = {12, 45, 0, 32, 22};
		for(int i=0; i<k.length; i++) {
			m1(k[i]);
		}
	}
	static void m1(int k) {
		m2(k);
	}
	
	static void m2(int k) /* throws ArithmeticException*/{
		try {
			System.out.printf("%d / %d = %d\n", 100, k, 100/k);			
		} catch (Exception e) {
			System.out.println("ERROR!!: " + e.getMessage());
		}
	}
}
