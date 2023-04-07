package Methods;

public class NonStaticMethodSameClass {

	public  void  demo1 () {         // Static word missing so Non-Static method // 
		
		System.out.println("demo is running");
	}
	
	public static void main(String[] args) {
		
		NonStaticMethodSameClass x = new NonStaticMethodSameClass() ; // for non Static method we need create a OBJECT 
		                                                              //i.e class name reference variable x = new class name ()
		
		x.demo1 ();  // reference variable.method name i.e. demo1
		
	
	}

}
