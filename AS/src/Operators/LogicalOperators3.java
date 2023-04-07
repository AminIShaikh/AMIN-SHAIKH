package Operators;

public class LogicalOperators3 {

	public static void main(String[] args) {
		int a=5,b=8;
		
		System.out.println( (a==b) && (b>a)); //false
		System.out.println( !(b<a) || b>a); //true
		System.out.println( (b<a));
		System.out.println( (a<b)  && (a<b));//false
	}
}
