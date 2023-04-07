package Package2;

import Package1.ClassA;

public class ClassC {
	
public static void main(String[] args) {
	
	ClassA x =new ClassA();    //object creation because non static variable
	
	System.out.println(x.a);   //calling public specifier
//	System.out.println(x.b);   //calling private specifier will not access because it is private specifier
//	System.out.println(x.c);   //calling protected specifier will not access because it is protected specifier
//	System.out.println(x.d);   //calling default specifier will not access because it is default specifier
 }
}
