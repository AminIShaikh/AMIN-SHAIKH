package PracticeProblems;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeClass
	
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@Test
	
	public void test123() {
		System.out.println("Test");
	}

}
