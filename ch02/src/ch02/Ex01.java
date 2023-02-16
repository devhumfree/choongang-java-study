package ch02;

public class Ex01 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples / sizeOfBucket;
		
		System.out.println(
				numOfApples % sizeOfBucket > 0 ? 
						"바구니의 수는 " + (int)(numOfBucket + 1) + "개."
						:
						"바구니의 수는 " + (int)(numOfBucket) + "개."
				);

	}

}
