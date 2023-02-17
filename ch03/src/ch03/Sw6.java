package ch03;

public class Sw6 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String season ="";
		int etc = num % 3;
		
		switch(etc) {
			case 0: season = "초"; break;
			case 1: season = "찐"; break;
			case 2: season = "늦";
			}
		switch(num) {
		case 12: case 1: case 2: season +="winter"; break;
		case 3: case 4: case 5: season +="winter"; break;
		case 6: case 7: case 8: season +="winter"; break;
		case 9: case 10: case 11: season +="winter"; break;
		default: season = "없는 월입니다.";
		}
		System.out.println(season);
	}

}
