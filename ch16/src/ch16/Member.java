package ch16;

public class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;

	private String name;
	private int gender;
	private int age;
	public Member(String _name, int _age, int _gender) {
		name=_name; gender=_gender; age=_age;
	}
	public String getName() {
		return name;
	}
	public int getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}
