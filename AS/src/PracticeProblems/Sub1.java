 package PracticeProblems;

public class Sub1 extends SuperP {
	
	public void Memo() {
		
		int a =40;
		int b=20;
		int c=b-a;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Sub1 x = new Sub1();
		x.Demo();
		x.Memo();
	}

}
