package Array;

public class MultiDimensional1 {                   //Jagged array problem
	
	public static void main(String[] args) {
		
		int [] [] a = { {10,20,30,40,50},{60,70,80},{90,10,20,30} };
		
		for(int i=0; i<=a.length-1; i++) {
			
			for(int j=0; j<=a[i].length-1; j++) {
				
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}

//for jagged array problem in the 2nd for loop j<=a[i].length is important
