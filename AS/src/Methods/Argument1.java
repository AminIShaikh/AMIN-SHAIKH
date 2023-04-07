package Methods;

public class Argument1 {

	public void  Subtraction( int a, int b)            //non static method with argument
	{
		int c=a-b;
		System.out.println("Subtraction=" + c);
	}
	
	public static void main(String[] args) {
		
		Argument1 x = new Argument1 ();                //object creation
		
		x.Subtraction(45,37);
		x.Subtraction(87,32);
	}
}
