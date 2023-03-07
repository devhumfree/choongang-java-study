package ch05;
class Car5 {
	String CarNo;  //차량번호
	int inTime;    //입고시간
	int outTime;   //출고시간
	int fee;       //주차요금
	final int MONEY_PER_HOUR = 3000; // 시간당 주차요금
// 생성자 cno, in ,out을 입력받고
// calFee(출고-입고) * 시간단가
//	차량번호, 입고시간, 출고시간, 주차요금 prn()
	
	Car5(String cno, int in, int out) {
		CarNo = cno; inTime = in; outTime = out; fee = (out - in) * MONEY_PER_HOUR;
	}
	
	void prn() {
		System.out.println("차량번호: "+CarNo+" 입고시간: "+inTime+" 출고시간: "+outTime+" 주차요금: "+fee);
		System.out.println("========================================================");
	}
}

public class Car5Ex {
	public static void main(String[] args) {
//		"가 1234" 10, 13
//		"나 3456" 9, 18
//		"다 6789" 11, 16
		
		Car5 car1 = new Car5("가 1234", 10, 13);
		Car5 car2 = new Car5("나 3456", 9, 18);
		Car5 car3 = new Car5("다 6789", 11, 16);
		Car5[] cars = {car1, car2, car3};
		
		for(Car5 car : cars) {
			car.prn();
		}
		
//		car1.prn(); car2.prn(); car3.prn();

	}
}
