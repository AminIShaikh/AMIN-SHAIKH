package ConditionStatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		String username = "Amin";
		String password ="Pass@123";
		
		if (username=="Amin") 
		{
			System.out.println("Correct Username");
			
			if (password=="Pass@12") 
			{
				System.out.println("Password is Correct");
				System.out.println("LogIn Successful");
			}
			else
			{
				System.out.println("Password is Incorrect");
				System.out.println("LogIn is UnSuccessful");
			}
		}
		else
		{
			System.out.println("Username is Incorrect");
			System.out.println("LogIn Failed-");
		}
		
	}
}
