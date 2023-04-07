package String;

public class Spaces {
	
	public static void main(String[] args) {
		
		String name ="Am in Sha i kh";
		
		int total=0;
		
		for( int i=0; i<=name.length()-1; i++ ) {
			
			 char Spaces = name.charAt(i);
			//System.out.println(Spaces);
			
			if(Spaces==' ') {
				total++;
			}
		}
		System.out.println(total);
	}

}
