package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 {
	public class sample1 {
		@Test
		public void TC8()
		{
			Assert.fail();
			Reporter.log("running TC8", true);
		}
		@Test
		public void TC9()
		{
			Reporter.log("running TC9", true);
		}
		@Test
		public void TC10()
		{
			Reporter.log("running TC10", true);
		}

}
}
