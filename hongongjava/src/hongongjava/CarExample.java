package hongongjava;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); // car객체의 run()메소드 5번 반복실행
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 Hankook타이어로 교체!");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 Kumho타이어로 교체!");
				car.frontRightTire = new KumhoTire("앞왼쪽", 15);
				break;
			case 3:
				System.out.println("뒤왼쪽 Hankook타이어로 교체!");
				car.backLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 4:
				System.out.println("뒤오른쪽 Kumho타이어로 교체!");
				car.backRightTire = new KumhoTire("앞왼쪽", 15);
				break;
			}
			System.out.println("=============================");
		}
	}
}
