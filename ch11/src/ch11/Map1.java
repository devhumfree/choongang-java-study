package ch11;
import java.util.*;
public class Map1 {
	public static void main(String[] args) {
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("person-a","010-5555-5555");
		hm1.put("person-b","010-6666-5555");
		hm1.put("person-c","010-7777-5555");
		hm1.put("person-d","010-8888-5555");
		System.out.println(hm1.get("person-b"));
		System.out.println(hm1.get("person-c"));
		System.out.println("=========================");
		
		Set<String> keys = hm1.keySet();
		for(String key : keys) {
			System.out.println(key+": "+hm1.get(key));
		}
		System.out.println("-------------------------");
		Iterator<String> it = hm1.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+": "+hm1.get(key));
		}
	}
}
