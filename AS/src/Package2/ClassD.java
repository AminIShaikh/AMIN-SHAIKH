package Package2;

import Package1.ClassA;

public class ClassD extends ClassA {       //inheritance used
	
	public static void main(String[] args) {
		
		ClassD x = new ClassD ();
		
		System.out.println(x.a);   // public can be used through out the project
		System.out.println(x.c);  //protected specifier can be used because of inheritance
	}

}
