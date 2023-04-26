package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
public static void main(String[] args) throws InterruptedException {
	//sets the configuration of browser
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().to("https://www.facebook.com");
		driver.quit();
		driver.navigate().back();//gmail
		driver.navigate().forward();//facebook
		driver.navigate().refresh();
		Thread.sleep(2000);
}
}
