package ch06;
class Box {
	void volume(int x, int y, int z) {
		System.out.printf("%d * %d * %d = %d\n", x, y, z, x*y*z);
	}
	
	void volume(double x, double y, double z) {
		System.out.printf("%f * %f * %f = %f\n", x, y, z, x*y*z);
	}	
//	void volume(double x, int y, int z) {
//		System.out.printf("%f * %d * %d = %f\n", x, y, z, x*y*z);
//	}
	
//	volume(int x, int y, int z) 부피
//	volume(doube x, y, z);
}
public class Overloading2 {
	public static void main(String[] args) {
//		객체생성
//		12, 15, 20
//		12.7, 5.6, 7.4 
//		15.2, 5, 20 실수와 정수가 섞여있는 정수는 실수로 변경가능, 실수는 강제형분환하지 않으면 정수로 변
		
		Box box = new Box();
		box.volume(12, 15, 20);
		box.volume(12.7, 5.6, 7.4);
		box.volume(15.2, 5, 20);

	}
}
