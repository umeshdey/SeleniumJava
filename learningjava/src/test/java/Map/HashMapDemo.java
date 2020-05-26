package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Name", "Vivek");
		map.put("Address", "Kolkata");
		
		System.out.println(map.get("Name"));
//		System.out.println(map.get("Address"));
		
		Set<String> keySet = map.keySet();
//		System.out.println("Keys:" + keySet);
		
		Collection<String> values = map.values();
//		System.out.println("Values:"+ values);
		
		for(String key : keySet) {
			System.out.println("Key:" + key + " value:" + map.get(key));
		}
		

	}

}
