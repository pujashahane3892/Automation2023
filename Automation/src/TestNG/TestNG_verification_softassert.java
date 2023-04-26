package TestNG;//in soft assert we have to use non-static method

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_verification_softassert {
	@Test
	public void test()
	{
		String expResult = "Good night";
		String actResult = "Good night";
		boolean result = false;
		SoftAssert soft = new SoftAssert();
		//verification 1
		soft.assertNotEquals(actResult, expResult, "verification 1 : act and exp result is same");
		//verification 2
		soft.assertEquals(actResult, expResult, "verification 2 : act and exp result is different");
		//verification 3
		soft.assertTrue(result, "verification 3 :  result is false");
		soft.assertAll();//to execute all assert methods
	}
	/*java.lang.AssertionError: The following asserts failed:
	verification 1 : act and exp result is same did not expect [Good night] but found [Good night],
	verification 3 :  result is false expected [true] but found [false]*/

}
