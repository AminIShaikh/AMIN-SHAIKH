package Interface;

public class Test3 implements Test1,Test2 {
	
	public void Memo1() {
		
		System.out.println("Memo 1 is Executed");
		
	}
	
	public void Memo2() {
		
		System.out.println("Memo 2 is Executed");
		
	}
	
	public void Memo3() {
		
		System.out.println("Memo 3 is Executed");
		
	}
	
	public void LMN1() {
		
		System.out.println("LMN 1 is Executed");
		
	}
	
	public void LMN2() {
		
		System.out.println("LMN 2 is Executed");
		
	}
	
public static void main(String [] args) {
		
		Test3 x = new Test3();
		x.Memo1();
		x.Memo2();
		x.Memo3();
		
		x.LMN1();
		x.LMN2();
	}

	

}
