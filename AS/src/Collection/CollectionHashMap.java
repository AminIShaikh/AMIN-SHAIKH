package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionHashMap {
	
	public static void main(String [] args) {
		
		HashMap <Integer,String> map = new HashMap<Integer,String>();            //order of insertion is random
		
		map.put(10, "Manual");
		map.put(20, null);
		map.put(30, "SQL");
		map.put(null, "API");
		map.put(50, "Automation");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			
			System.out.println("Key= " + m.getKey() + " "+ "Value= " + m.getValue());
		}
		
		System.out.println("####################");
		
		map.remove(null, "API");
		
        for(Map.Entry<Integer, String> m : map.entrySet()) {
			
			System.out.println("Key= " + m.getKey() + " "+ "Value= " + m.getValue());
		}
		
	}

}
