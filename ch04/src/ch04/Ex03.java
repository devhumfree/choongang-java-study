package ch04;
public class Ex03 {

	public static void main(String[] args) {
		//  거스름돈 372000을 50000, 10000, 5000, 1000로 줄때 몇개씩 주어야 하나
		int[] changes = {50000, 10000, 5000, 1000}; 
		int money = 372000;
		int val = 0;

		for(int i = 0; i <changes.length; i++) {
			val = money / changes[i];
			System.out.printf("%d는 %d개 \t",changes[i], val);
			// money -= changes[i]*val;
			money %= changes[i];
			System.out.println("남은돈: " + money);
		}

	}

}
