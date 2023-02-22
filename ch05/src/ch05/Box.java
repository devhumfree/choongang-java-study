package ch05;

public class Box {
	//기본 생성자, 없으면 compile할 때 생성자를 만들어준다
	int height, width, depth;
	
	void volume(String ex) {
		System.out.println( height * width * depth);
		System.out.println(ex);
	}
	
}
