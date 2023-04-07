package Methods;

public class StaticMethod {

	public static void Demo()   //Static method
	{
		System.out.println("Internal Mock is Conducted");
	}
	public void Demo1()           //Non Static Method
	{
		System.out.println("Internal Mock Date 5/12");
	}
	
	
	public static void main(String[] args) {
		
		Demo();        //call for Static Method
		
		StaticMethod x = new StaticMethod();     // call for non Static Method by creation of object
		x.Demo1();
	}
	
	
	
	
	
	
	
	
	
	
}
