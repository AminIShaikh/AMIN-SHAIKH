package ConditionStatement;

public class NestedIfStatement3 {
public static void main(String[]args) {
	String Name="Amin";
	String Surname="Shaikh";
	
	if(Name=="Amin")
	{
		System.out.println("Name is Correct");
		if(Surname=="XYZ") 
		{
		System.out.println("Surname is Correct");
		System.out.println("Name and Surname is Correct");
		}
		else
		{
			System.out.println("Surname is Incorrect");
			System.out.println("Name and Surname is Incorrect");
		}
	}
	else
	{
		System.out.println("Name is Incorrect");
	}
	
}
}
