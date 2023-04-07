package Polmorphism;

public class Overloading1 {
	
	public static void Addition(int a, int b) {  //Static method
		
		System.out.println(a+b);
	}
	
	public static void Addition(int l,int m,int n) {  //Static method
		
		System.out.println(l+m+n);
	}
	
	public static void main(String[] args) {
		
		Overloading1.Addition(60, 40);        //calling by class name.method name
		Overloading1.Addition(10, 30, 50);
	}

}

//Overloading is done for both static and non static methods