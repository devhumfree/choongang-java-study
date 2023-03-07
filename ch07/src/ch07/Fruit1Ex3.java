package ch07;

public class Fruit1Ex3 {
	public static void main(String[] args) {
		FruitSeller3 fs1 = new FruitSeller3("jane", 30, 1000);
		FruitSeller3 fs2 = new FruitSeller3("rose", 20, 0);
		FruitsBuyer3 fb1 = new FruitsBuyer3("robbin", 0, 20000);
		FruitsBuyer3 fb2 = new FruitsBuyer3("woody", 5, 10000);
		FruitsBuyer3 fb3 = new FruitsBuyer3("siren", 0, 50000);
		
		fb1.buyFruit(fs1, 3000);
		fb2.buyFruit(fs2, 12000);
		fb3.buyFruit(fs1, 152000);
		
		fs1.print();
		fs2.print();

		fb1.print();
		fb2.print();
		fb3.print();
	}
}
