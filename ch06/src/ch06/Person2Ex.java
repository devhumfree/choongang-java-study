package ch06;

public class Person2Ex {
	public static void main(String[] args) {
		Student4 st1 = new Student4(); 
		st1.setName("Tom"); st1.setAge(33); st1.setSno("rk 1234");
		Student4 st2 = new Student4(); 
		st2.setName("ben"); st2.setAge(29); st2.setSno("rk 4567");
		
		Teacher th1 = new Teacher();
		th1.setName("rose"); th1.setAge(50); th1.setSubject("designer");
		Teacher th2 = new Teacher();
		th2.setName("sam"); th2.setAge(43); th2.setSubject("carpenter");
		
		Manager mg1 = new Manager();
		mg1.setName("cleo"); mg1.setAge(36); mg1.setPart("bar");
		Manager mg2 = new Manager();
		mg2.setName("kurt"); mg2.setAge(33); mg2.setPart("barbi");
		
		st1.printAll(); st2.printAll();
		th1.printAll(); th2.printAll();
		mg1.printAll(); mg2.printAll();
	}
}
