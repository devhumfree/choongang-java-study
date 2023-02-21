package ch05;

public class Box {
	int height, width, depth;
	
	void volume(String ex) {
		System.out.println( height * width * depth);
		System.out.println(ex);
	}
	
}
