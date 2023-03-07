package ch10;

public class Exception3 {
	public static void main(String[] args) {	
		int[] x = {12,45,25,0,17};
		int num = 100;
		int result = 0;
		for(int i = 0; i <x.length; i++) {
			try{
				result = 100 / x[i];
				System.out.println(result);
			}catch (ArithmeticException e){
				System.out.println("안댕");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("안녕");
			}
		}
		
		
	}
}
