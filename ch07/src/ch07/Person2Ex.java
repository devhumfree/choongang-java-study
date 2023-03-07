package ch07;

public class Person2Ex {
	public static void main(String[] args) {
		Person2[] person = new Person2[6];
		person[0] = new Student2("rose", 26, "970201");
		person[1] = new Student2("brown", 29, "960201");
		person[2] = new Teacher2("jenny", 27, "JAVA");
		person[3] = new Teacher2("mason", 32, "DATA");
		person[4] = new Manager2("hermes", 38, "cleaning");
		person[5] = new Manager2("dodge", 26, "driving");
		
		for(Person2 p : person) {
			p.print();
			
		}
		
	}
}
