package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		//HashMap is fast, unsynchronized, works with single thread, allows one null key
		//HashTable is slow, synchronized, works with multiple thread, does not allow null key.
		//LinkedHashMap preserves the insertion order.

		//Map map = new HashMap();//here we created an object map and we can store any data type
		
		Map<String,String> map = new HashMap<>();//<String,String> means key : value relationship. Key is String
		//and then value is also String.
		//here we created an object map and we specified that we want to store only String data type.
		
		map.put("myName", "Mike");
		map.put("myJob", "Developer");
		map.put("myAge", "25");
		map.put("x", "y");
		
		System.out.println(map);
		
		System.out.println(map.get("myName"));
		System.out.println(map.get("myName2"));
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			
			System.out.println(key + " " + map.get(key));
		}
		
		
		
		
		
		
		

	}

}
