package Inheritance;

public class Hierarchical1 extends Parent {
	
	public void Bungalow() {
		System.out.println("Bungalow");
	}
	
	public static void main(String[] args) {
		
		Hierarchical1 x = new Hierarchical1();
		
		x.Home();       //parent property
		x.Money();      //parent property
		x.Car();        //parent property
		
		x.Bungalow();
		
	}

}
