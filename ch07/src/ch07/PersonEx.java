package ch07;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("brad", 50, " 5678");
		Student st2 = new Student("nathan", 43, " 12324");
		Teacher th1 = new Teacher("jonahan", 24,"JAVA");
		Teacher th2 = new Teacher("kennt", 42,"Spring");
//		Manager mg1 = new Manager{"kelly", 19, "cleaner"};
//		Manager mg2 = new Manager{"sopheo", 19, "cleaner"};
		
		st1.printSt();
		st2.printSt();
		th1.printTh();
		th2.printTh();
		
	}
}
