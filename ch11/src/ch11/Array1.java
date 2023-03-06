package ch11;
import java.util.ArrayList;
import java.util.Iterator;
public class Array1 {

	public static void main(String[] args) {
//		E: Element 요소, 제네릭스, Generic
//		갯수가 정해지지 않음(유동)
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("구렁이"); al1.add("팔렁이"); // al1.add(888); 문자열 아님
		al1.add("구렁삼"); al1.add("팔렁사"); al1.add("구렁오");
		System.out.println("데이터 건수: "+al1.size());
		for(int i = 0; i<al1.size(); i++) {
			System.out.print(al1.get(i)+"\t");
		}
		System.out.println();
		for(String str : al1) {
			System.out.print(str+"\t");
		}
		System.out.println();
		Iterator<String> its = al1.iterator();
		while(its.hasNext()) { // 가져올 다음 데이터 있냐
			System.out.print(its.next()+"\t"); // 다음 데이터 
		}
	}

}
