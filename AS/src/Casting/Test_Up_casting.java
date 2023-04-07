package Casting;

public class Test_Up_casting extends Up_Casting {
	
	public void Test() {
		System.out.println("Test from Sub class");    //Test method is property of sub class
	}
	
	public static void Memo() {                       //Memo and Demo methods are property from super class 
		System.out.println("Memo from Sub class");    //overriding done for Memo method 
	}                                                 //overriding not done for Demo method 
	
	public static void main(String[] args) {
		
//		Test_Up_casting x = new Test_Up_casting();
//		x.Demo();
//		x.Memo();
//		x.Test();
		
		//Up Casting
		//Object Created
		//Syntax: 
		//Super class ref. variable = new subclass();
		
		Up_Casting y = new  Test_Up_casting();
		y.Demo();
		y.Memo();

	}

}
