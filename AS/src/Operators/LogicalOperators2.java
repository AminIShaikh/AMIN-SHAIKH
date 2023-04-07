package Operators;

public class LogicalOperators2 {

	public static void main(String[] args) {
		
		System.out.println( (5>6) || !(5==6) ); //true
		
		System.out.println( (15<6) && !(15>16) ); //false
		
		System.out.println( (10>=10) && (10>9) ); //true
		
		System.out.println( (21==31) || !(31>21) ); //false
		
		System.out.println( (10<11) && (9>10) ); //false
		
	}
}
