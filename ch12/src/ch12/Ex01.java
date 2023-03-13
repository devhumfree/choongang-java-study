package ch12;

public class Ex01 {
	public static void main(String[] args) {
		// Runnable구현한 클래스를 이용하여 객체 생
		Thread3 r1 = new Thread3();
		// Thread생성할 때 매개변수 위에서 생성한 객체 전달
		Thread th1 = new Thread(r1);
		// 생성된 쓰레드 start()
		th1.start();

	}

}

class Thread3 implements Runnable {
	public void run() {
		for (int i = 0; i<300; i++) {
			System.out.println('-');
			try {
				Thread.sleep(500);				
			} catch (InterruptedException e) {}
		}
	}
}
