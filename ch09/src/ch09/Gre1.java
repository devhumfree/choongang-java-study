package ch09;
import java.util.*;
public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.printf("today is %d %d %d \n",
				gc.get(GregorianCalendar.YEAR),
				gc.get(GregorianCalendar.MONTH)+1,
				gc.get(GregorianCalendar.DATE)
				);
//		2023, 
		GregorianCalendar gc2 = new GregorianCalendar(2023, 4, 28);
		System.out.printf("today is %d %d %d \n",
				gc2.get(GregorianCalendar.YEAR),
				gc2.get(GregorianCalendar.MONTH)+1,
				gc2.get(GregorianCalendar.DATE)
				);
		
		GregorianCalendar birth = new GregorianCalendar(1991, 2, 8);
		System.out.printf("birthday is %d %d %d \n",
				birth.get(GregorianCalendar.YEAR),
				birth.get(GregorianCalendar.MONTH)+1,
				birth.get(GregorianCalendar.DATE)
				);
	}
	
}
