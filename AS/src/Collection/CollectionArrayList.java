package Collection;

import java.util.ArrayList;

public class CollectionArrayList {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(2499);
		list.add("amin");
		list.add(24.99f);
		list.add('@');
		
		int size = list.size();
		
		for(int i=0; i<size; i++) {
			
			System.out.println(list.get(i));
		}
		System.out.println("####################");
		
		list.remove(2);
		
        for(int i=0; i<size; i++) {
			
			System.out.println(list.get(i));
		}
		
	}

}
