package ch09;

public class Person {
	String name;
	int juminNo;
	
	public Person(String name, int juminNo) {
		this.name = name;
		this.juminNo = juminNo;
	}
//	같다는 기준을 정할 때 사용
	public boolean equals(Object obj) {
		return name.equals(((Person)obj).name);
//		return juminNo == ((Person)obj).juminNo;
		
//		기본형은 == 같다
//		참조형 데이터는 equals 같다
		
	}
	public String toString() {
		return "인간[이름: " + name + ", 주민번호: "+juminNo +"]";
	}
}
