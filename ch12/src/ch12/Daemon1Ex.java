package ch12;

class Demon1 extends Thread {
	public void run() {
		while(true) {
			System.out.println("데몬");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}			
		}
	}

}
public class Daemon1Ex {
	public static void main(String[] args) {
		Demon1 dm = new Demon1();
		// 메인 작업이 끝나면 모든 쓰레드를 종료해라. 반드시 start()보다 앞에서 실행
		dm.setDaemon(true);
		dm.start();
		for(int i =0; i<20; i++) {
			System.out.println(i);
			try {Thread.sleep(300); }
			catch(InterruptedException e) {}
		}
	}
}
