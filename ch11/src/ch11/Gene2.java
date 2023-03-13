package ch11;
import java.util.ArrayList;
public class Gene2 {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
//	Generics에 클래스나 인터페이스 이름이 들어가면 그 클래스 또는 상속받거나 구현한 클래스만 사용 가능
		list.add(new Bus()); 		list.add(new Ambulance());
		list.add(new FireEngine()); // list.add(new Taxi());
//	print method사용, Bus인경우 move메서드 실행
		for(Car car:list) {
			car.print();
			((Bus) car).move();
		}
	}
}