package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
public static void main(String[] args) {
	//sets the configuration of browser
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		
		Dimension d = new Dimension(500,800);//width,hight
		driver.manage().window().setSize(d);
		
		//Thread.sleep(2000);
		
		driver.quit();
}
}
