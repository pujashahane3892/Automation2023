package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Multibrowser_testing {
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
   WebDriver driver = null;

    if(browserName.equals("chrome"))
		{
    	ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver(option);//upcasting
		
	}else if(browserName.equals("edge"))
		{
		System.setProperty("webdriver.edge.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new EdgeDriver();
    }
	else if(browserName.equals("firefox"))
    {	
    System.setProperty("webdriver.gecko.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new FirefoxDriver();
    }
	else if(browserName.equals("ie"))
   {
	System.setProperty("webdriver.ie.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new InternetExplorerDriver();
}
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.quit();

}
}