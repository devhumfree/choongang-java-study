package ch09;

public class CardEx {
	public static void main(String[] args) {
		Card c1 = new Card("spade", 10);
		Card c2 = new Card("spade", 7);
		Card c3 = new Card("heart", 10);
		
		if(c1.equals(c2)) System.out.println("1, 2같다");
		else System.out.println("1, 2다르다");
		if(c1.equals(c3)) System.out.println("1, 3같다");
		else System.out.println("1, 3다르다");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
