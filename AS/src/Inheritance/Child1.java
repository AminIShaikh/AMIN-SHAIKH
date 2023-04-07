package Inheritance;

public class Child1 extends Child  {      
	
	public static void Cycle () {
		System.out.println("Cycle");
	}
	
	public static void main(String[] args) {
		
		Child1 x = new  Child1();  //object created for sub class
		
		x.Home();
		x.Money();
		x.Car();
		x.Bike();
		Cycle();     //called by method name because of static method
	}

}
