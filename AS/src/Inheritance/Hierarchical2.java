package Inheritance;

public class Hierarchical2 extends Parent {
	
	public void PentHouse() {
		System.out.println("PentHouse");
	}
	
	public static void main(String[] args) {
		Hierarchical2 x = new Hierarchical2();
		
		x.Home();      //parent property
		x.Money();     //parent property
		x.Car();       //parent property
		
		x.PentHouse();
		
		
	}

}
