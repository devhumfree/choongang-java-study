package ch05;
class Card {
	static int width, height;  // 가로 100, 세로 240
	String kind;
	int number;
	void prn() {
		System.out.println("가로: "+width+" 세로: "+height);
		System.out.println("종류: "+kind);
		System.out.println("숫자: "+number);
	}
}
public class CardEx {
	public static void main(String[] args) {
		// 스페이드 7, 다이아몬드 1, 클로바 10
		Card spade = new Card();
		Card dia = new Card();
		Card clova = new Card();
		
		Card.width = 100;
		Card.height = 240;
		
		spade.number = 7;
		spade.kind = "spade";
		spade.prn();	
		
		dia.number = 1;
		dia.kind = "dia";
		dia.prn();	
		
		clova.number = 7;
		clova.kind = "clova";
		clova.prn();
	}
}
