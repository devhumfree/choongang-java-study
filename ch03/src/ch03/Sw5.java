package ch03;

public class Sw5 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
//		자바에서는 정수/정수 => 정수
		
		switch(score/10) { // score-1 +또는 -를 사용하여 점수 조정 가능
		case 10: case 9: grade +="A"; break;
		case 8: grade +="B"; break;
		case 7: grade +="C"; break;
		case 6: grade +="D"; break;
		default: grade +="F";
		}
		System.out.println("점수는 " + grade + "입니다.");
	}
}
