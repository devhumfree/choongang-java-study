package ch03;

public class If3 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		
		if(score > 60) {
			System.out.println("합격!");
		}else {
			System.out.println("불합격! 쟌넨다네");
		}

	}

}
