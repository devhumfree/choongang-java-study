package ch16;

public class Student2 implements Comparable<Student2>{
	private String name;

	private int score;
	Student2(String _name, int _score) {
		name=_name; score=_score;
	}
	public String getName() {return name;}
	public int getScore() {return score;}
	
	public int compareTo(Student2 o) {
		return 0;
	}
}
