package ch13;
import java.io.Serializable;
// Serializable를 구현해야 직열화 가능하다
public class GoodStock  implements Serializable {
	String code;
//	int num; 
//	transient : 전달금지, 숫자는 0, 문자는 null
	transient int num;
	public GoodStock(String code, int num) {
		this.code = code; this.num = num;
	}
	public String toString() {
		return "주식[코드:"+code+", 수량:"+num+"]";
	}
}