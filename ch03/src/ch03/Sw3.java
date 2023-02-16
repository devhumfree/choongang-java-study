package ch03;

public class Sw3 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String season ="";
		
		switch(num) {
		case 12: season = "겨울입니다.";
		case 1: season = "겨울입니다.";
		case 2: season = "겨울입니다."; break;
		
		case 3: season ="봄입니다.";
		case 4: season = "봄입니다.";
		case 5: season = "봄입니다."; break;
		
		case 6: season = "여름입니다.";
		case 7: season = "여름입니다.";
		case 8: season = "여름입니다."; break;
		
		case 9: season = "가을입니다.";	
		case 10: season = "가을입니다.";		
		case 11: season = "가을입니다."; break;
		
		default: season = "없는 월입니다.";
		}
		System.out.println(season);
	}

}
