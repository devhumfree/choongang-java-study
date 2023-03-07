package ch09;

public class Math1 {
	public static void main(String[] args) {
//		round 반올림 6이상이면 올림, 4이면 버림
//		ceil 현재 숫자보다 큰 정수 중에서 최소값
//		floor 현재 숫자보다 작은 정수 중에서 최대
//		rint: 가장 가까운 정
		double d1 = 4.1, d2 = 4.7, d3 = -4.1, d4=-4.7;
		System.out.println("round d1 = " + Math.round(d1));
		System.out.println("round d1 = " + Math.round(d2));
		System.out.println("ceil d1 = " + Math.ceil(d1));
		System.out.println("ceil d2 = " + Math.ceil(d2));
		System.out.println("floor d1 = " + Math.floor(d1));
		System.out.println("floor d2 = " + Math.floor(d2));
		System.out.println("rint d1 = " + Math.rint(d1));
		System.out.println("rint d2 = " + Math.rint(d2));
		System.out.println("=========================");
		System.out.println("round d1 = " + Math.round(d3));
		System.out.println("round d1 = " + Math.round(d4));
		System.out.println("ceil d1 = " + Math.ceil(d3));
		System.out.println("ceil d2 = " + Math.ceil(d4));
		System.out.println("floor d1 = " + Math.floor(d3));
		System.out.println("floor d2 = " + Math.floor(d4));
		System.out.println("rint d1 = " + Math.rint(d3));
		System.out.println("rint d2 = " + Math.rint(d4));
	}
}
