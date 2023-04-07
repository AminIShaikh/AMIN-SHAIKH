package Array;

public class Swapping1 {
	
	public static void main (String [] args) {
		
		int a[] = {35,40,70,60,99,95};
		                                     //a.length = size
		for(int i=0;i<=a.length-1;i++) {     //a.length-1 = index
			
			System.out.println(a[i]);
		}
		System.out.println("Swapping");
		
		for(int i=0; i<a.length /2; i++) {
			
			int c;
			
			c=a[i];
			
			a[i]=a[(a.length -1)-i];
			
			a[(a.length-1)-i]=c;
			
		}
		for(int i=0;i<=a.length -1;i++) {
			System.out.println(a[i]);
		}
	}

}
