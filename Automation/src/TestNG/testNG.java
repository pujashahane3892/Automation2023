package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG {
	@Test
	public void test()
	{
		System.out.println("running test method");
		Reporter.log("running test method", false);//msg will disply on emailable report only
		Reporter.log("running test method",true);//msg will disply on console as well as emailable report.
	}

}
