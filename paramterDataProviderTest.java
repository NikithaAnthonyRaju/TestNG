package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utilityFun.excelLib;


public class paramterDataProviderTest {
	
	
	@DataProvider
	public Object[][] data() throws Exception{
		excelLib xl = new excelLib("Sheet", this.getClass().getSimpleName());
		return xl.getTestdata();
		
	}
	
		
	@Test(dataProvider = "data")
	public void test(String Name, String ID, String Address, String PhoneNumber) {

				
		System.out.println(Name);
		System.out.println(ID);
				
		
		System.out.println(Address);
		System.out.println(PhoneNumber);
		
	}
		
}
