package ConditionStatement;

public class NestedIfStatement2 {

	public static void main(String[] args) {
		
		int Phy,Chem,Maths;
		Phy=54;Chem=32;Maths=47;
		
		if(Phy>=35)
		{
			System.out.println("Pass");
			
			if(Chem>=35)
			{
				System.out.println("Pass");
				
				if(Maths>=35)
				{
					System.out.println("Pass");
				}
				else 
				{
					System.out.println("Fail");
				}
			}
			else 
			{
				System.out.println("Fail");
			}
		}
		else 
		{
			System.out.println("Fail");
		}
		
	}
}