package ch08;
interface C1 {
	String STR = "WOW! Last lecture of today";
	void c1();
}
interface C2 extends C1 {void c2();}
interface C3 extends C2 {void c3();}
class C4 implements C3 {
	public void c1() {
		System.out.println("berry");
	}
	public void c2() {
		System.out.println("blackberry");
		
	}
	public void c3() {
		System.out.println("blueberry");
		
	}
}
public class Inter3 {
	public static void main(String[] args) {
		C4 c = new C4();
		c.c1(); c.c2(); c.c3();
		System.out.println("STR: "+C4.STR);
	}

}
