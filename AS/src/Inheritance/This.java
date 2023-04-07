package Inheritance;

public class This {
	
	int a=99;            //global variable
	
	public void Demo () {
		
		int a=40;        //local variable
		
		System.out.println(a);       //local variable called in Demo method
		System.out.println(this.a);  //global variable with same Variable name called using 'this' keyword
		                             //because calling  in same class we use 'this' keyword
	}
	
	public static void main(String []args) {
		
		This x = new This();
		x.Demo();
	}

}
