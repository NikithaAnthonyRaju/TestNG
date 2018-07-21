package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterXmlTest {
	
	@Test
	@Parameters("strName")
	public void testCase1(String strName) {
		System.out.println("Parameterized value is : " + strName);
	}
	
	@Test
	@Parameters("strID")
	public void testCase2(String strID) {
		System.out.println("Parameterized value is : " + strID);
	}


}
