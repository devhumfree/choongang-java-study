package ch05;

public class InitBlk1 {
	int[] k1 = new int[5]; // 객체를 생성한 후에 사용 가능
	static int[] k2 = new int[5]; // 클래스를 로딩하면 바로 사용 가능
	{ //초기화 블럭.메소드 안부르고 바로 실행, 객체를 생성 할 때 마다 실
		for(int i = 0; i < k1.length; i++) {
			k1[i] = (int)(Math.random() * 20) +1;
//			k2[i] = (int)(Math.random() * 20) +1;
		}
	}
	
	static { // 정적 초기화 블럭, 한번만 실행
		for(int i = 0; i < k2.length; i++) {
			k2[i] = (int)(Math.random() * 20) +1;
		}
	}
}
