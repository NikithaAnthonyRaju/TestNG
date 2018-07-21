package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.Reporter;

import utilityFun.excelLib;

public class assertAndReportsTest {
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	@DataProvider
	public Object[][] data() throws Exception{
		excelLib xl = new excelLib("Sheet", this.getClass().getSimpleName());
		return xl.getTestdata();
		
	}
			
	@Test(dataProvider = "data")
	public void test(String Name, String ID, String Address, String PhoneNumber) {
		
		DOMConfigurator.configure("log4j.xml");
		
		Reporter.log("Sarting the TestCases");
				
		System.out.println(Name);
		System.out.println(ID);
				
		Assert.assertTrue(Name.contains("T"));		
		Assert.assertEquals("Name", Name);	
		
		Log.info("Assert Condition is completed");
		
		System.out.println(Address);
		System.out.println(PhoneNumber);
				
		Reporter.log("Ending the TestCases");

	}
		
}
