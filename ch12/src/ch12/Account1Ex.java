package ch12;

public class Account1Ex {
	public static void main(String[] args) {
		Account1 act = new Account1(10000); // 잔액이 10000원인통장 개설
		Account1User[] au = new Account1User[5];
		au[0] = new Account1User(act, "rhion");
		au[1] = new Account1User(act, "mason");
		au[2] = new Account1User(act, "dre");
		au[3] = new Account1User(act, "doc");
		au[4] = new Account1User(act, "kelly");
		
		for(Account1User a : au) {
			a.start();
		}
		
	}
}
