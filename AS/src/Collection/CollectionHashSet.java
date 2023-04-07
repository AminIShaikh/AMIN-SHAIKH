package Collection;

import java.util.HashSet;

public class CollectionHashSet {
	
	public static void main(String[] args) {
		
		HashSet<Character> set = new HashSet<Character>(); 
		
		//insertion order not maintain i.e.random order
		
		set.add('@');
		set.add('#');
		set.add('$');
		set.add('%');
		set.add('&');
		set.add('*');
		set.add('!');
		
		for(char s : set) {
			
			System.out.println(s);
		}

		
		
	}

}
