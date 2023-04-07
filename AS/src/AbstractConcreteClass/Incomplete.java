package AbstractConcreteClass;

public abstract    class Incomplete {    //Abstract class
	
	public abstract   void Test();      //incomplete method
	
	public static void Memo() {
		
		System.out.println("Memo running from Incomplete class");
		
	}
	
	public void Demo() {             //complete method
		
		System.out.println("Demo running from Incomplete Class");
	}

}

//In abstract class we can declare both incomplete as well as complete method
