package ch07;

public class AnimalEx {
	public static void main(String[] args) {
		Animal pig = new Pig();
		Animal bird = new Bird();
		Animal fish = new Fish();
		
		pig.move(); bird.move(); fish.move();

		System.out.println("========================");
		
//		Animal[] animals = {pig, bird, fish};
		Animal[] animals = { new Pig(), new Bird(), new Fish() };
		
		for(Animal i : animals) {
			System.out.println(i.x);
			i.move();
			if( i instanceof Bird) {
				((Bird)i).eat();
			}
		}
		System.out.println("========================");
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
			System.out.println("x = " + animals[i].x);
			if (animals[i] instanceof Bird) {
				((Bird)animals[i]).eat();
			}
		}
	}
}
