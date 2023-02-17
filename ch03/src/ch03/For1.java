package ch03;

public class For1 {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();

		for(int i = 10; i > 0; i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		for(int i = 1; i<=10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		for(int i = 1;i<=10; i*=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println();
		int num = 0;
		for(int i = 1; i<=10; i++) {
			num +=i;
		}
		System.out.println(num);
	}

}
