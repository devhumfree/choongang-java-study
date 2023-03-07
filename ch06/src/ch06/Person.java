package ch06;
public class Person {
	private String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("나이가 0보다 작은 경우는 없어 ");
			this.age =0;
		} else this.age = age;
	}
	void print() {
		System.out.println("===================");
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}