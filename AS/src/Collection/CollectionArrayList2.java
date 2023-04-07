package Collection;

import java.util.ArrayList;

public class CollectionArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		al.add(123);
		al.add(456);
		al.add(789);
		al.add(987);
		
		for(int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		
		System.out.println("################");
		
		al.remove(2);
		
		for(int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
	}

}
