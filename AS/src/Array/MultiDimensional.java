package Array;

public class MultiDimensional {
	
	public static void main(String[] args) {
		
		int  [] [] a = { {21,22,23,24,25},{31,32,33,34,35},{41,42,43,44,45},{51,52,53,54,55} };
		
		//int b = a.length;
		//System.out.println(b);
		
		for(int i=0; i<=a.length-1 ; i++) {
			
			for(int j=0; j<=a[i].length-1; j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
