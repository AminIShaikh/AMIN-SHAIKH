package Methods;

public class Argument2 {

	public static void main(String[] args) {        
		
		                                        //calling argument from class Argument 1 for non static method
 Argument1 x = new Argument1 ();                //object creation
		
		x.Subtraction(45,37);
		x.Subtraction(87,32);
		
		Argument.Addition(25,26);         //calling argument from class Argument for static method by using class name & method name
		Argument.Addition(21,31);
	}
}
