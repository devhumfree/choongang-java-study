package ch07;

public class Fruit1Ex2 {
	public static void main(String[] args) {
		FruitSeller2 fs1 = new FruitSeller2("jane", 30, 1000);
		FruitSeller2 fs2 = new FruitSeller2("rose", 20, 0);
		FruitsBuyer2 fb1 = new FruitsBuyer2("robbin", 0, 20000);
		FruitsBuyer2 fb2 = new FruitsBuyer2("woody", 5, 10000);
		FruitsBuyer2 fb3 = new FruitsBuyer2("siren", 0, 50000);
		
		fb1.buyFruit(fs1, 3000);
		fb2.buyFruit(fs2, 2000);
		fb3.buyFruit(fs1, 2000);
		
		fs1.print();
		fs2.print();

		fb1.print();
		fb2.print();
		fb3.print();
	}
}
