package ch02;

public class Logical2 {

	public static void main(String[] args) {
		boolean b1 = 5>3, // true
				b2 = 5<3, // false
				b3 = 5 == 3, // false
				b4 = 5!=3; // true
		
		System.out.print("b1&&b2: ");
		System.out.println(b1&&b2);
		
		System.out.print("b1||b2: ");
		System.out.println(b1||b2);
		
		System.out.print("b1&&b3: ");
		System.out.println(b1&&b3);
		
		System.out.print("b1||b4: ");
		System.out.println(b1||b4);
		
		System.out.print("b2&&b4: ");
		System.out.println(b2&&b4);
		
		System.out.print("b2||b4: ");
		System.out.println(b2||b4);
		
		System.out.print("b2&&b3: ");
		System.out.println(b2&&b3);
		
		System.out.print("b2||b3: ");
		System.out.println(b2||b3);
		
		System.out.print("b3&&b4: ");
		System.out.println(b3&&b4);
		
		System.out.print("b3||b4: ");
		System.out.println(b3||b4);

	}

}
