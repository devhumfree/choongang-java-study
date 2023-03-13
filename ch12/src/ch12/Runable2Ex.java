package ch12;
//class Run2 implements Runnable {
	class Run2 extends Object implements Runnable {
	// 자바는 다중 상속을 지원하지 않음 => Runnable
	public void run() {
		for(int i = 0; i < 10; i++) {
//			Thread.currentThread() 현재 작업중인 Thread
			System.out.println(Thread.currentThread().getName()+i+ " ");
			try {
				Thread.sleep(500);				
			} catch (InterruptedException e) {}
		}
	}
}

public class Runable2Ex {
	public static void main(String[] args) {
		Run2 r1 = new Run2(); Run2 r2 = new Run2(); Run2 r3 = new Run2(); 
		Thread th1 = new Thread(r1,"대박");
		Thread th2 = new Thread(r2,"쪽박");
		Thread th3 = new Thread(r3,"옹박");
		th1.start(); th2.start(); th3.start();
	}
}
