package ch16;

import java.util.Arrays;
import java.util.List;

public class MapandReduce1Ex {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("Brown", 77),
				new Student2("Honey", 88),
				new Student2("Rose", 66),
				new Student2("Edgar", 45)
				);
		double avg = list.stream().mapToInt(Student2::getScore).average().getAsDouble();
		System.out.println("평균 검수: " + avg);
	}
}
