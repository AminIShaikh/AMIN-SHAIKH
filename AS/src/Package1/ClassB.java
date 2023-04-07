package Package1;

public class ClassB {
	
	public static void main(String[] args) {
		
ClassA x =new ClassA();    //object creation
		
		System.out.println(x.a);   //calling public specifier
		// System.out.println(x.b);   //calling private specifier will show error because scope of private specifier remains within a class
		System.out.println(x.c);   //calling protected specifier
		System.out.println(x.d);   //calling default specifier
	}

}
