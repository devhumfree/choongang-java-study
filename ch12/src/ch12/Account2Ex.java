package ch12;

public class Account2Ex {
	public static void main(String[] args) {
		Account2 act = new Account2(10000); // 잔액이 10000원인통장 개설
		Account2User[] au = new Account2User[5];
		au[0] = new Account2User(act, "rhion");
		au[1] = new Account2User(act, "mason");
		au[2] = new Account2User(act, "dre");
		au[3] = new Account2User(act, "doc");
		au[4] = new Account2User(act, "kelly");
		
		for(Account2User a : au) {
			a.start();
		}
		
	}
}
