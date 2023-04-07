package PracticeProblems;

public class Concrete_class extends Abstract_class {
	
	public void  Test() {
		System.out.println("Test is executed");
	}
	
	public void Demo() {
		System.out.println("Demo is executed in sub class");
	}
	
	public static void main(String[] args) {
		Concrete_class x = new Concrete_class();
		x.Demo();
		x.Test();
		
	}

}
