package ch07;
class G1{
	G1(){}
	int age = 17;
	G1(String name) {
		System.out.println(name + "이 생성되었습니다.");
	}
	void disp() {
		System.out.println("오늘 금요일이야");
	}
}

class G2 extends G1 {
	int age = 18;
	G2(String name) { // super(매개변수, ...) 없으면 부모 default 생성자가 호출됨 / 
		              // 부모 디폴트 생성자 만들거나 현재 위치에 super('매개변수')넣음
		super(name);
		System.out.println(name + "야 반가워.");
	}
	void disp() {
		System.out.println("공부하기 딱 좋은 요일이구나");
	}
	void print() {
		System.out.println("Parent Age: "+ super.age);
		System.out.println("childe Age: "+ age);
		
		super.disp();
		disp();
		
	}
	
}
public class CarEx3 {
	public static void main(String[] args) {
		G2 g = new G2("danny");
		g.print();
	}
	
}
