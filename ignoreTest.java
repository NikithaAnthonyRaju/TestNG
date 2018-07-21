package test;

import org.testng.annotations.Test;

public class ignoreTest {
	
	@Test(enabled=false)
	public void testCase1() {
		System.out.println("Test case 1 is executing");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test case 2 is executing");
	}
}
