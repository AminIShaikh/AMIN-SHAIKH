package String;

public class ToGetAlternateCharacters {
	

	    public static void main(String[] args) {
	        
	        // Example string
	        String input = "Amin Shaikh";
	        
	        // Extract alternate characters
	        String result = "";
	        for(int i = 0; i < input.length(); i += 2) {
	            result += input.charAt(i);
	        }
	        
	        // Print the result
	        System.out.println(result);
	    }
	}



