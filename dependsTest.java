package test;

import org.testng.annotations.Test;

public class dependsTest {
	
	@Test(groups={"sanityTest"})
	public void testCase1() {
		System.out.println("Group Test is Started");
	}
	
	@Test(dependsOnGroups = {"sanityTest"})
	public void testCase2() {
		System.out.println("Group Test is Completed");
	}

	@Test
	public void testCase3() {
		System.out.println("Test Cases is Started");
	}
	
	@Test(dependsOnMethods = {"testCase3"})
	public void testCase4() {
		System.out.println("Test Cases is Completed");
	}

}
