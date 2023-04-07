package Interface;

public class DefaultInterface_Calling implements DefaultInterface {
	
	public void Demo() {
		System.out.println("Demo is executed");
	}
	
	
	public static void main(String[] args) {
		
		DefaultInterface_Calling x = new DefaultInterface_Calling();
		x.Demo();
		
		x.Memo();
		
	}

}
