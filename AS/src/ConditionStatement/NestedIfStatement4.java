package ConditionStatement;

public class NestedIfStatement4 {
public static void main(String[] args) {
	int Balance=55000;
	
	if (Balance>=10000)
	{
		System.out.println("Amount can be Withdrawn");
		if (Balance>=20000)
		{
			System.out.println("Eligible for Credit Card");
			if (Balance>=30000)
			{
				System.out.println("Eligible for Personal Loan");
			}
			else
			{
				System.out.println("Not Eligible for Persoanl Loan");
			}
		}
		else
		{
			System.out.println("Not Eligible for Persoanl Loan");
		}
	}
	else
	{
		System.out.println("Amount cannot be Withdrawn");
	}
		
}
}
