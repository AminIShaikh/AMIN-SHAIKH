package Generalization;

public class Calling {
	
	public static void main(String[] args) {
		
		Sub x = new Sub();
		x.Addition();
		x.Subtraction();
		
		Div y = new Div();
		y.Addition();
		y.Division();
		
		Multi z = new Multi();
		z.Addition();
		z.Multiplication();
	}

}
