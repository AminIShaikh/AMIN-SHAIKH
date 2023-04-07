package Polmorphism;

public class Overriding2 extends Overriding1 {
	
	public void Test() {        //non static method
		
		System.out.println("Re-Test is Conducted");   
	}
	
	public static void main(String[] args) {
		
		Overriding2 x = new Overriding2();   //object created for sub class
		x.Test();
		
	}

}
