package LogicalStatement;

public class Star9 {

	public static void main(String[] args) {
		
           int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");    //spaces
			}
			for(int j=1;j<=4;j++)
			{
				System.out.print("*" + " ");   //stars
				
			}
			System.out.println();
		}
	}
}
