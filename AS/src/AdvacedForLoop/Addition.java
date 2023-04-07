package AdvacedForLoop;

public class Addition {
	
	public static void main(String[] args) {
		
		int ar [] = {10,20,30,40,50};
		
		int add = 0;
		
		for(int addition : ar) {
			add = add+addition;
		}
		System.out.println("Sum of Numbers = " + add);
	}

}
