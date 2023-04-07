package Constructor;

public class Block {

	//non static block
	{
		System.out.println("Non Static Block ");
	}
	
	// Static block
	static {
		System.out.println("Static Block ");
	}
	
	public static void main(String[] args) {
		
		//System.out.println("Main Method running");
		
		Block x = new Block();
		
	}
	
}
 // important = Static Block will always execute before the main method