package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderAnnotations {
	@DataProvider(name = "dp")
	public Object[][]dataProviderMethod()
	{
		return new Object[][] {{"pooja"},{"Mayur"},{"Pari"},{"Ayush"}};
		
	}
	@Test(dataProvider = "dp")
	public void TC1(String value)
	{System.out.println(value);

}
}
