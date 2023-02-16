package ch03;

public class If8 {

	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		String log = "";
		if(value >= 1000) {
			log = "1000이상의 값 입니다.";
		}else if(value < 1000 || value >100) {
			log = "100이상 1000미만의 값 입니다.";
		}else if(value > 10 || value <100) {
			log = "10이상 100미만의 값 입니다.";
		}else
			log = "10미만의 값 입니다.";
			
		System.out.println(log);

	}

}
