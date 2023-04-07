package PracticeProblems;

public class TofindNumberofsameCharacter {

	public static void main(String[] args) {
		
		String s = "My name is Amin Shaikh";
		int counter = 0;
		
		for( int i=0; i<s.length(); i++ ) {
			
		if( s.charAt(i) == 'a' ) {
		counter++;
		}
		}
		System.out.println(counter);
	}
}
