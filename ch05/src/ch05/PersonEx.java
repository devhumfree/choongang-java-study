package ch05;
class Person {
	// name, age, hobby
	// default, name, name/age, name/age/hobby
	String name, hobby; int age;
	
	Person(){}
	Person(String n){
		name = n;
	}
	Person(String n, int a){
		name = n; age = a;
	}
	Person(String n, String h, int a){
		name = n; age = a; hobby = h;
	}
		void prn() { // 출력
			System.out.println("이름: "+name);
			System.out.println("나이: "+age);
			System.out.println("취미: "+hobby);
			System.out.println();
		}
}

public class PersonEx {

	public static void main(String[] args) {
		// 4개의 생성자를 만들고 출력
		// 지미/26/요리, 제니/33/운동, 팀/40/게임, 마이크/22/농구
		
	Person jimmy = new Person(); jimmy.name = "jimmy"; jimmy.hobby = "cook"; jimmy.age=26;
	Person jenny = new Person("jenny"); jenny.hobby = "exercise"; jenny.age=33;
	Person tim = new Person("tim",40); tim.hobby="game";
	Person mike = new Person("mike","basketball",22);
	
	jimmy.prn(); jenny.prn(); tim.prn(); mike.prn(); 
	}

}
