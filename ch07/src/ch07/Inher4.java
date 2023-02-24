package ch07;
class D1 {
	int k1 = 7;
	D1(){
		System.out.println("할아버지 생성자");
	}
	void m1() {
		System.out.println("난 할아버지");
	}
}
class D2 extends D1{
	int k2 = 77;
	D2(){
		System.out.println("아버지 생성자");
	}
	void m2() {
		System.out.println("난 아버지");
	}
}
class D3 extends D2{
	int k3 = 777;
	D3(){
		System.out.println("아들 생성자");
	}
	void m3() {
		System.out.println("난 아들");
	}
}


public class Inher4 {
	public static void main(String[] args) {
		D3 d = new D3();
		System.out.println(d.k1); 
		System.out.println(d.k2);
		System.out.println(d.k3);
		
		d.m1(); d.m2(); d.m3();
	}

}
