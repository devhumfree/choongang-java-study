package ch03;

public class If5 {

	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		String msg = "";
		
		if(money>1000000)			msg = "1000000이상 비행기 타세요";
		else if(money>100000)		msg = "100000 KTX";
		else if(money>50000)		msg = "50000 택시";
		else if(money>1000)			msg = "1000 버스";
		else						msg = "신발";
		
		System.out.println(msg);
	}

}
