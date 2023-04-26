package DDF_POM_TestNG_baseclass_Utilityclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {//used for to open browser
	static WebDriver driver;
	public static void openBrowser() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		 driver = new ChromeDriver(option);//upcasting
		 
		 
		driver.manage().window().maximize();
		driver.navigate().to(UtilityClass.getPropertiFileData("URL"));
		Thread.sleep(2000);
	}

}
