package ch06;
//  Singleton, Design Pattern
public class Single1 {
//	static 붙으면 클래스 로딩할 때 1번 실행 클래스변수
	private static Single1 instance = new Single1();
//	private을 사용하면 외부에서 객체를 생성 못함
	Single1() { }
//	처음에 생성된 instance를 같이 사용
//	객체를 생성할 때는 instance를 사용
	public static Single1 getInstance() {
		return instance;
	}
}