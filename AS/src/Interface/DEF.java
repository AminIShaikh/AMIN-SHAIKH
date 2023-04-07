package Interface;

public class DEF implements ABC {
	
	public void Demo1() {
		
		System.out.println("Demo 1 is Executed");
		
	}
	
	public void Demo2() {
		
		System.out.println("Demo 2 is Executed");
		
	}
	
	public static void main(String[] args) {
		
		DEF x = new DEF();
		x.Demo1();
		x.Demo2();
	}

}
