package Collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap1 {
		
	 public static void main(String[] args) {
		
		 HashMap <Integer,String> map = new HashMap<Integer,String>();
		 
		 map.put(10, "Mumbai");        //oder of insertion not maintained
		 map.put(23, null);          //only one null key and any number of null values  acceptable
		 map.put(null, "Kolhapur");      //it will show nullpointer exception
		 map.put(45, null);
		 map.put(55, "Aurangabad");
		 map.put(61, "Navi Mumbai");
		 map.put(71, "Solapur");

		 for(Map.Entry<Integer, String> number : map.entrySet()) {
			 System.out.println("Key=" + number.getKey() + " Value=" + number.getValue());
		 }
		 
	}

}
