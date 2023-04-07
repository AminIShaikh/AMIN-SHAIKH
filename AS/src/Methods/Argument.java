package Methods;

public class Argument {

	public static void Addition( int a, int b)       //static method with argument
	{                                                //Declaration done between ( ) is argument
		int c=a+b;
		System.out.println("Addition=" + c);
	}
	
	public static void main(String[] args) {
		
		Addition(31,29);                            //integer a, integer b are initialized 
		Addition(25,25);
		Addition(41,19);
	}
}
