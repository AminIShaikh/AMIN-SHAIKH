package Operators;

public class OperatorsPractice {
	
	static int a =10;
	static int b=20;
	int c=30;
	
	public static void main(String []args) {
		System.out.println(a+b);
	
		OperatorsPractice x = new OperatorsPractice();
		 System.out.println(x.c+a);
		 
		 System.out.println(b-x.c);
		 
		 System.out.println(++a - b);
		 
		 System.out.println(x.c-a+b);  //here value of a =11 because on line number 17 we have taken ++a
		 
		 System.out.println(x.c<a);
		 
		 System.out.println(a>b);
		 
		 System.out.println(x.c<=a);
		 
		 System.out.println(b>=x.c);
		 
		 System.out.println(b!=a);
		 
		 
	}

}
