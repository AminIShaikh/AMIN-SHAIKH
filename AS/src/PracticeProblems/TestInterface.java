package PracticeProblems;

public class TestInterface implements Interface1 {

	public void test() {
	System.out.println("test method is running");	
	}
	
	public static void main(String[] args) {
		
		TestInterface r = new TestInterface();
		r.test();
		
		
		Interface1.demo();  //static method 
		
		r.memo(); 
		
		
		
	}
}
