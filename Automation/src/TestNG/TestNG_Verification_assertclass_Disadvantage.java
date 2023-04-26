package TestNG;//in hard assert we have to use static method

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verification_assertclass_Disadvantage {
	//hard assert
	@Test
	public void test()
	{
		String expResult = "Good night";
		String actResult = "Good night";
		boolean result = false;
		
		//verification 1
		Assert.assertNotEquals(actResult, expResult, "verification 1 : act & exp result is same");
		//verification 2
		Assert.assertEquals(actResult, expResult ,"verification 2 : act & exp result is different");
		//verification 3
		Assert.assertTrue(result,"verification 3 : result is false");
	}

}
