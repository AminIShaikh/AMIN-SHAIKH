package AbstractConcreteClass;

public class Complete extends Incomplete {
	
	public void Test() {            
		
		System.out.println("Test is Running ");
	}
	
	public void Demo() {
		
		System.out.println("Demo is Running");
	}
	
	public static void Memo() {
		
		System.out.println("Memo is executed");
	}
	
	public static void main(String [] args) {
		
		Complete x = new Complete();
		x.Test();
		x.Demo();
		Incomplete.Memo();
		Complete.Memo();
	}
	
	

}
