package Array;

import java.util.Arrays;

public class AscDsc {
	
	public static void main(String [] args ) {
		
		int a[] = {10,34,27,59,74,46};     //declaration and initialization of an Array
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);      //Array will be converted in Ascending order
		
		System.out.println("Array in Ascending Order");
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println("Array in Descending Order");
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.println(a[i]);
		}
		
	}

}

//when we use Arrays.sort it will automatically import arrays from java library
//Arrays.sort Will convert Array in ascending order
