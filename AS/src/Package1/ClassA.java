package Package1;

public class ClassA {

	public int a=70;
	
	private int b=90;
	
	protected int c=50;
	
	int d=35;
	
	public static void main(String[]args) {
		
		ClassA x =new ClassA();    //object creation because non static variable
		
		System.out.println(x.a);   //calling public specifier
		System.out.println(x.b);   //calling private specifier
		System.out.println(x.c);   //calling protected specifier
		System.out.println(x.d);   //calling default specifier
	}
}
