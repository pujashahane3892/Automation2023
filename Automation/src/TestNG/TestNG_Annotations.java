package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	@BeforeClass
	public void openBrowser()
	{
		
	}
	@BeforeMethod()
	public void Login()
	{
		
	}
	@Test()//first test
	public void verifyUN()
	{
		
	}
	@AfterMethod()
	public void verifyPW()
	{
		
	}
	@AfterClass()
	public void logout()
	{
		
	}
}
//execution flow
//beforMethod test first afterMethod
//beforMethod test second afterMethod.
