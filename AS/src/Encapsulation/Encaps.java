package Encapsulation;

public class Encaps {
	
	private int a; 
	private int b;
	
	Encaps() {
		
		a=80;
		b=65;
	}
	Encaps(int c,int d) {
		
		a=c;
		b=d;
	}
	public void Demo() {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Encaps x = new Encaps();
		x.Demo();
	}

}
//In Encapsulation variables are declared as private
