package String;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String a = "level";
		
		String reverse = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			
			reverse = reverse + a.charAt(i);
		}
		
		if(a.equals(reverse)) {
			
			System.out.println("String is Palindrome");
		}
		else {
			
			System.out.println("Not A Palindrome String");
		}
	}

}
