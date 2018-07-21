package test;

import org.testng.annotations.Test;

public class priorityTest {
	
	@Test(priority=0)
	public void testCase1() {
		System.out.println("Test case 1 is executing");
	}
	
	@Test(priority=1)
	public void testCase2() {
		System.out.println("Test case 2 is executing");
	}
	
	@Test(priority=0)
	public void testCase3() {
		System.out.println("Test case 3 is executing");
	}
	
	@Test(priority=-1)
	public void testCase4() {
		System.out.println("Test case 4 is executing");
	}

}
