package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Group {
@Test(groups = "flipcart")
public void TC1()
{
	Reporter.log("runnimng tC1", true);
			
}
@Test(groups ="Gmail")
public void TC2()
{
	Reporter.log("runnimng tC2", true);
			
}
@Test(groups = "facebook")
public void TC3()
{
	Reporter.log("runnimng tC3", true);
			
}
@Test(groups = "Facebook")
public void TC4()
{
	Reporter.log("runnimng tC4", true);
			
}
@Test(groups="Gmail")
public void TC5()
{
	Reporter.log("runnimng tC5", true);
			
}
@Test(groups = "Facebook")
public void TC6()
{
	Reporter.log("runnimng tC6", true);
			
}
}

