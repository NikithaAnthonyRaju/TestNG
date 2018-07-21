package test;

import org.testng.annotations.Test;

public class groupTest {
	
	@Test(groups={"sanityTest","regressionTest"})
	public void testCase1() {
		System.out.println("Sanity & Regression Test case");
	}
	
	@Test(groups={"regressionTest"})
	public void testCase2() {
		System.out.println("Regression Test case");
	}

	@Test(groups={"sanityTest"})
	public void testCase3() {
		System.out.println("Sanity Test case");
	}
	
	@Test(groups={"sanityTest", "progressionTest"})
	public void testCase4() {
		System.out.println("Sanity & Progression Test case");
	}
}
