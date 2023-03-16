package ch16;

import java.util.Arrays;
import java.util.List;

public class PipedSt1Ex {
	public static void main(String[] args) {
		List<Member> list =Arrays.asList(new Member("하니",17,Member.FEMALE),
				new Member("제니",26,Member.FEMALE),
				new Member("브라운",31,Member.MALE),
				new Member("에드거",29,Member.MALE),
				new Member("젤리",23,Member.FEMALE)
				);
		double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("평균나이" + avg);
		
		avg = list.stream().filter(m->m.getGender()==Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("평균나이" + avg);
		
		avg = list.stream().filter(m->m.getGender()==Member.FEMALE).mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("평균나이" + avg);
	}
}
