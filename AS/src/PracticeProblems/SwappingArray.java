package PracticeProblems;

public class SwappingArray {
	
public static void main (String [] args) {
		
		int a[] = {35,40,70,60,99,95};
		
		for(int i=0;i<6;i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("Swapping");
		
//		for(int i=0; i<a.length /2; i++) {
//			
//			int c=a[i];
//			
//			a[i]=a[(a.length -1)-i];
//			
//			a[(a.length-1)-i]=c;
//			
//		}
		for(int i=5;i>=0;i--) {
			System.out.println(a[i]);
		}
	}


}
