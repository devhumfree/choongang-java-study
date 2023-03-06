package ch10;

public class Throw2 {

	public static void main(String[] args) {
//		try {
//			m1();
//		} catch(Exception e) {
//			e.printStackTrace(); 에러가 발생한 흔적을 추적하여 출력
//		System.out.println("내가 해야겠네: " + e.getMessage());
//			}
		m1();

	}

	private static void m1() /*throw Exception */ {
		try {
			m2();			
		} catch (Exception e) {
			System.out.println("내가 해야겠네: " + e.getMessage());
		}
		
	}

	private static void m2() throws Exception{
		throw new Exception("쪽박 에러");
	}

}
