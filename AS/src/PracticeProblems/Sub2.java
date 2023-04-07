package PracticeProblems;

public class Sub2 extends Sub1 {
	
	public void Multi() {
	int a =10;
	int b=20;
	int c=a*b;
	System.out.println(c);
	
	
}
	public static void main(String[] args) {
		
		Sub2 y = new Sub2();
		y.Multi();
		y.Memo();
		y.Demo();
	}
}