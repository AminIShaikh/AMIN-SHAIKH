package Inheritance;

public class Child extends Parent {
	
	public void Bike () {
		System.out.println("Bike");
	}
	
	public static void main(String[] args) {
		
		Child x = new Child ();    //object created for sub class 
		
		x.Home();  //parent class property
		x.Money(); //parent class property
		x.Car();   //parent class property
		x.Bike();
	}

}
