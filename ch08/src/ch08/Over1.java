package ch08;

public class Over1 { // final을 class앞에 붙이면 상속 금지
	void m1() {// fianl 메서드 앞에 붙이면overriding 금지
		System.out.println("I'm parent Method");
	}
}
class Over2 extends Over1{
	@Override // 어노테이션 설명 및 잘못여부 체크
	void m1() {
		System.out.println("I'm child Method");
	}
}

