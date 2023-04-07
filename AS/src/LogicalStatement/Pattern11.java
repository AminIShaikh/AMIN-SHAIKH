package LogicalStatement;

public class Pattern11 {

	public static void main(String[] args) {
		
int n=5;
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");    //spaces
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");   //stars
				
			}
			System.out.println();
		}
	}
}
