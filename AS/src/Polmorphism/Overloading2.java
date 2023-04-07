package Polmorphism;

public class Overloading2 {
	
	public void Subtraction(int a,int b) {      //non static method
		
		System.out.println(a-b);
	}
	
	public void Subtraction(int x,int y,int z) {       //non static method
		
		System.out.println(x-y-z);
	}
	
	public static void main(String[] args) {
		
		Overloading2 r = new Overloading2();  //object created
		
		r.Subtraction(60, 40);
		r.Subtraction(70, 40, 20);
	}

}
