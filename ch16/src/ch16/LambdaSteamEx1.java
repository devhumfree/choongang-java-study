package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student1 {
	public String getName() {
		return name;
	}
	public void setName(String $name) {
		name = $name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int $age) {
		age = $age;
	}
	
	private String name;
	private int age;
	Student1(String $name, int $age) {
		name = $name;
		age = $age;
	}
}
public class LambdaSteamEx1 {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("하니", 17), new Student1("brown", 31),
				new Student1("Jenny", 26), new Student1("silver", 27));
		Stream<Student1> stream = list.stream();
		stream.forEach(s -> System.out.println(s.getName()+" : "+s.getAge()));
	}
}
