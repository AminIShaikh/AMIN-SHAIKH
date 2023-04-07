package Collection;

import java.util.Hashtable;
import java.util.Map;

public class CollectionHashtable {
	
 public static void main(String[] args) {
	
	 Hashtable <Integer,String> table = new Hashtable<Integer,String>();
	 
	 table.put(10, "Mumbai");        //oder of insertion not maintained
	 table.put(23, "Pune");          //null key and null values not acceptable
	 table.put(30, "Kolhapur");      //it will show nullpointer exception
	 table.put(45, "Nashik");
	 table.put(55, "Aurangabad");
	 table.put(61, "Navi Mumbai");
	 table.put(71, "Solapur");

	 for(Map.Entry<Integer, String> number : table.entrySet()) {
		 System.out.println("Key=" + number.getKey() + " Value=" + number.getValue());
	 }
	 
}
}
