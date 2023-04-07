package ConditionStatement;

public class IfElseIfLadderStatement3 {

	public static void main(String[] args) {
		
		int AgeOfA=5,AgeOfB=6;
		
		if (AgeOfA==AgeOfB) {
			System.out.println("A and B are of same Age ");
		}
		else if (AgeOfA>AgeOfB) {
			System.out.println("A is Older than B");
		}
		else if (AgeOfA<AgeOfB) {
			System.out.println("A is Younger than B");
		}
		else {
			System.out.println("Age of A and B are Different ");
		}
	}
}
