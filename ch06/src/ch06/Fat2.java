package ch06;

public class Fat2 {

	public static void main(String[] args) {
		int[] nums = {3, 4, 5, 6, 7};
		for(int num : nums) {
			System.out.println(num+"계승 : " + fat1(num));	
			}
	}
	private static int fat1(int num) {
		int result = 1;
		for(int i = num; i > 0;  i--) {
			if(i == 1) System.out.print(i + "=");
			else System.out.print(i+" * ");
			result *= i;
		}
		return result;
	}
	
	static int fat2(int num) {
		if( num == 1) {
			System.out.print(num+" = ");
			return 1;
		}
		else {
			System.out.print(num+ "*");
			return num * fat2(--num);
		}
	}

}
