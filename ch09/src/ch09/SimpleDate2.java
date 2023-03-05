package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDate2 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(2023,3,3,1,30,20);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd HH:dd:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("(E)yyyy/MM/dd (a)hh:dd:ss");
		Date date = gc.getTime();
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
	}
}
