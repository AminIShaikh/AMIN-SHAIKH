package GlobalLocalVariable;

public class GlobalLocal {
	
	int A=10;       //global variable
	int B=20;      //global variable
	
	public static int Test() {
		
		int  C=30;       //local variable
	System.out.println(C);
	return C;
	}
	
	
	public static void main(String[] args) {
		
		GlobalLocal x =new GlobalLocal();
		
		System.out.println(x.A);
		System.out.println(x.B);
		x.Test();
	
		
		
	}

}
