package ch07;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {76, 45, 34, 89, 100, 50, 90, 92};
		int temp;
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					temp =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i : a) {
			System.out.println(i);
		}
	}

}
