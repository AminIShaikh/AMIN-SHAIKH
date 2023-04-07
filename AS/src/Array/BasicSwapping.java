package Array;

public class BasicSwapping {
	
	public static void main(String[] args) {
		
		int a=40;
		int b=60;
		
		System.out.println(a);      //a=40
		System.out.println(b);      //b=60
		
		System.out.println("Swapping");
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}

//we use 3rd variable 'c' to swap values of 'a' and 'b'
//here 'c' is given value of 'a'
//then 'a' has no value so we declare value of a=b
//then value of 'b' is assigned to 'a' so 'b' does not have any value
//then 'b' is assigned the value of 'c'
