package ch03;

public class If9 {

	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		String season = "";
		
		if(value <= 2) {
			season = "겨울입니다.";
		}else if(value<=5) {
			season = "봄입니다.";
		}else if(value<=8) {
			season = "여름입니다.";
		}else if(value<=11) {
			season = "가을입니다.";
		}else if(value<=12) {
			season = "겨울입니다.";
		}else season = "없는 계절입니다.";
		
		System.out.println(season);

	}

}
