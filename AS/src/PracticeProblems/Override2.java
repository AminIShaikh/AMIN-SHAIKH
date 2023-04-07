package PracticeProblems;

public class Override2 extends Override1 {
	
	public void Demo() {
		System.out.println("Demo from sub Class");
	}
	public static void main(String[] args) {
		
		Override2 x = new Override2();
		x.Demo();
		
	}

}
