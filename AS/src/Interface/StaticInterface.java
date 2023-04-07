package Interface;

public interface StaticInterface {
	
	public static void Test() {    //static method declared 
		
		System.out.println("Test method is executed from static interface");
		
	}
	
	public void Demo();       //non static method declared

}


      //In Interface we declare only Non static incomplete methods only
      
      //if we declare Static method in the Interface then we have to give its body i.e. we can only use Complete method 
