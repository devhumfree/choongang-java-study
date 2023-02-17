package ch03;

public class Sw4 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String season ="";
		
		switch(num) {
		case 12: case 1: case 2:
			switch(num) {
			case 12: season = "초"; break;
			case 1: season = "찐"; break;
			case 2: season = "늦";
			}
			season +="겨울입니다";break;
			
		case 3: case 4: case 5:
			switch(num) {
			case 3: season = "초"; break;
			case 4: season = "찐"; break;
			case 5: season = "늦";
			}
			season +="봄입니다";break;
			
		case 6: case 7: case 8:
			switch(num) {
			case 6: season = "초"; break;
			case 7: season = "찐"; break;
			case 8: season = "늦";
			}
			season +="여름입니다";break;
			
		case 9: case 10: case 11:
			switch(num) {
			case 9: season = "초"; break;
			case 10: season = "찐"; break;
			case 11: season = "늦";
			}
			season +="가을입니다";break;
		
		default: season = "없는 월입니다.";
		}
		System.out.println(season);
	}

}
