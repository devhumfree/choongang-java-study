package ch06;
class Student3 {
	String name; int kor, eng, math;
	Student3(String name) {
		this(name,60); 
		System.out.println("매개변수 1개 이름 : " + name);
	}
	Student3(String name, int kor) {
		this(name,kor, 60); 
		System.out.println("매개변수 2개 이름 : " + name+", 국어 : "+kor);
	}
	Student3(String name, int kor, int eng) {
		this(name,kor, eng, 60); 
		System.out.println("매개변수 3개 이름 : " + name+", 국어 : "+kor+", 영어 : "+eng);
	}
	Student3(String name, int kor, int eng, int math) {
		System.out.println("매개변수 4개 이름 : " + name+", 국어 : "+kor+", 영어 : "+eng+", 수학 : "+math);
	}
}
public class Student3Ex {
	public static void main(String[] args) {
		Student3 st1 = new Student3("하니");
	}
}