package ch09;

public class Card {
	String kind;
	int number;
	
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
        
	}
	
	public boolean equals(Card obj) {
//		return number == ((Card)obj).number;
		return kind.equals(obj.kind);
	}
	public String toString() {
		return "종류 : " + kind + ", 숫자: "+number +"]";
	}
}
