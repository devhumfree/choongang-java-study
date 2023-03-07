package ch05;

public class BoxEx {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.height = 10;
		box1.width = 15;
		box1.depth = 18;
		
		box1.volume("테스트1");
		
		box2.height = 11;
		box2.width = 12;
		box2.depth = 15;
		
		box2.volume("테스트2");
		
		Car1 c1 = new Car1();
		c1.color = "Blue"; c1.displacement = 2500; c1.name="bmw";
		System.out.println("색깔: " + c1.color);
		System.out.println("배기: " + c1.displacement);
		System.out.println("이름: " + c1.name);
	}
}
