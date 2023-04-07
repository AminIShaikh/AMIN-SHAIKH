package Polmorphism;

public class Hiding2 extends Hiding1 {

	public static void Demo() {
		
		System.out.println("Demo running from Hiding 2");
	}
	
	public static void main(String[] args) {
		
		//Hiding1.Demo();
		//Hiding2.Demo();
		
		Hiding2 x = new Hiding2(); //method hiding
		x.Demo();
	}
}
