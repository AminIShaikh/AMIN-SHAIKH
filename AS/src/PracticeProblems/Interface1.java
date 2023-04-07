package PracticeProblems;

public interface Interface1 {
	
	public void test();    //non static
	
	public static void demo() {
		System.out.println("Interface1 is running");
	}
	public default void memo() {
		System.out.println("Default method of interface1"); 
		 
	 }
	

}
