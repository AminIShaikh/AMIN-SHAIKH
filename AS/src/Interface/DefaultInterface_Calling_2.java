package Interface;

public class DefaultInterface_Calling_2 implements DefaultInterface {
	
	public void  Demo() {
		System.out.println("Demo executed from Default Interface 2");
	}
	
	public static void main(String[] args) {
		
		DefaultInterface_Calling_2 x = new DefaultInterface_Calling_2();
		x.Demo();
		x.Memo();

		
		
	}

}
