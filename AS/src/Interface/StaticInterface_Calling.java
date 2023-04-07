package Interface;

public class StaticInterface_Calling implements StaticInterface {
	
	public void Demo() {    //Demo method is completed
		System.out.println("Demo is executed");
	}
	
	public static void main(String[] args) {
		
		StaticInterface_Calling x = new StaticInterface_Calling();
		x.Demo();
		
		StaticInterface.Test();  //static method called with the help of class name.method name 
	}
	
	

}
