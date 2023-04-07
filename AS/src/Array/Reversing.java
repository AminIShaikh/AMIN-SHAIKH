package Array;

public class Reversing {
	
	public static void main(String[] args) {
		
		int a [] = {10,21,28,13,47,55,36,78,88,19};
		
		int b = a.length-1 ;
		//System.out.println(b);
		
		for(int i=0;i<=b;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Swapping done");
		
		for(int i=b;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
