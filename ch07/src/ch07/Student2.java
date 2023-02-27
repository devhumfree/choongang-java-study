package ch07;

public class Student2 extends Person2 {
	private String sno;
	public Student2(String name, int age, String sno) {
		super(name, age); this.sno = sno;
	}
	void print() {
		super.print();
		System.out.println("sno: "+sno);
	}
}

class Teacher2 extends Person2 {
	private String subject;
	public Teacher2(String name, int age, String subject) {
		super(name, age); this.subject = subject;
	}
	void print() {
		super.print();
		System.out.println("subject: "+subject);
	}
}

class Manager2 extends Person2 {
	private String part;
	public Manager2(String name, int age, String part) {
		super(name, age); this.part = part;
	}
	void print() {
		super.print();
		System.out.println("part: "+part);
	}
}