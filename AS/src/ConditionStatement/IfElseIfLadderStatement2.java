package ConditionStatement;

public class IfElseIfLadderStatement2 {

	public static void main(String[] args) {
		
		int MarksObtained=72;
		
		if(MarksObtained>=75) {
			System.out.println("Passed with A Grade");
			
		}
		else if (MarksObtained>=60) {
			System.out.println("Passed with B Grade");
		}
		else if (MarksObtained>=50) {
			System.out.println("Passed with C Grade");
		}
		else {
			System.out.println("Passed with D Grade");
		}
			
	}
}
