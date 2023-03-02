package ch09;
import java.util.*;

public class Cal1 {
	public static void main(String[] args) {
//		추상클래스이면서 생성자가 protected
//		Calendar cal = new Calendar
//		월은 0부터 시작하여 11 끝
		Calendar cal = Calendar.getInstance(); // new Calendar();
		System.out.printf("Today is %d %d %d \n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		1년중에 며칠째
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		Date date = new Date();
		System.out.println(date);
	}
}
