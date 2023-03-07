package ch11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		HashMap<String, String> fruits = new HashMap<>();
		fruits.put("딸기","달콤하다.");
		fruits.put("수박","시원하다.");
		fruits.put("키위","시큼하다.");
		
		System.out.println(fruits.get("딸기"));
		System.out.println(fruits.get("수박"));
		System.out.println("=========================");
		
		Set<String> keys = fruits.keySet();
		for(String key : keys) {
			System.out.println(key+": "+fruits.get(key));
		}
		System.out.println("-------------------------");
		Iterator<String> it = fruits.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+": "+fruits.get(key));
		}
		
		
	}

}
