package Casting;

public class Explicit {
	
	public static void main(String[] args) {
		
		long a=123;
		System.out.println(a);
		
		double b=a;
		System.out.println(b);
		
		float c= (float) b;
		System.out.println(c);
		
		int d= (int)c;
		System.out.println(d);
		
		short e= (short)d;
		System.out.println(e);
		
		byte f= (byte)e;
		System.out.println(f);
		
	}

}
//Explicit casting is a type of Primitive Casting

//In Explicit casting conversion of higher data type of information into lower data type of information 

