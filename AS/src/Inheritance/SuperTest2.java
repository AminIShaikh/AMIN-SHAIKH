package Inheritance;

public class SuperTest2 extends SuperDemo1 {
	
	int a=50;     //global variable
	
	public void xyz() {
		
		int a=80;         //local variable
		
		System.out.println(a);         //called local variable  
		System.out.println(this.a);    //global variable called using 'this' keyword in same class (a=50)
		System.out.println(super.a);   //global variable called using 'super' keyword from other class (a=100)
	}
	
	public static void main(String[] args) {
		
		SuperTest2 q = new SuperTest2();
		q.xyz();
		
	}

}
