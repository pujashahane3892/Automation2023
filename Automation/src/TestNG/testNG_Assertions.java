package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_Assertions {
	//AssertEquals
	@Test
	public void test1()
	{
		Reporter.log("running test1 method",true);
		String expResult = "Hello";
		String actResult = "hello";
		Assert.assertEquals(actResult, expResult,"act and exp are not equals");
	}
	//AssertNotEquals
	@Test
	public void test2()
	{
		Reporter.log("running test1 method",true);
		String expResult = "Hello";
		String actResult = "hello";
		Assert.assertNotEquals(actResult, expResult,"act and exp are equals");
	}
	//assertTrue 
	@Test
	public void test3()
	{
		Reporter.log("running test3 method",true);
		boolean result =true;
		Assert.assertTrue(result, "result is true");
	}
	//assertFalse
	@Test
	public void test4()
	{
		Reporter.log("running test4 method",true);
		boolean result = false;
		Assert.assertFalse(result,"result is false");
	}
	
	//assertNull()
	@Test
	public void test5()
	{
		Reporter.log("running test5 method",true);
		String result = null;
		Assert.assertNull(result, "result is not null");
	}
	//assertNotNull()
		@Test
		public void test6()
		{
			Reporter.log("running test6 method",true);
			String result = "Pooja";
			Assert.assertNotNull(result, "result is  null");// always pass opposite msg
		}
		
		//assertFail()
		@Test
		public void test7()
		{
			Reporter.log("running test7 method",true);
			Assert.fail();
		}

}
