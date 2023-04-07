package ExceptionHandling;

public class TryCatch {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		int c;
		
		
		try {
			
			c=a/b;   //risky code
			
		}
		
		catch(ArithmeticException e) {
			
			b=5;         //alternative code
			c=a/b;
			
		}
		
		System.out.println(c);
		
	}

}
