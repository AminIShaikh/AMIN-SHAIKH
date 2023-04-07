package Operators;

public class LogicalOperators {

	public static void main (String [] args) {
		
		System.out.println( (60>40) && (60<40) );
		
		System.out.println( (60>40) && (40<60) );
		
		System.out.println( (60>40) && (70<60) );
		
		System.out.println( (60<40) || (40>60) );
		
		System.out.println( !(60==40) );
		
		System.out.println( !(40>60) );
	}
}
