package Interface;

public interface DefaultInterface {
	
	public default void Memo() {   //default method is non Static method
		System.out.println("Memo is executed from default method");
	}
	
	public void Demo();

}
//default is a key word not an access specifier
//if we declare default method in interface it should be complete method
//we cannot call default method in interface because it is by default public and abstract  
//we can use properties of default method of interface in various implementation classes
//To call default method of Interface we need create object of Implementation class in which we are calling