package automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setposition {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		//sets the configuration of browser
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);//upcasting
	
		//1. get() - to open url
		
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	//Thread.sleep(1000);
	//driver.quit();
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	//setPosition() - used to set the position of browser
Point p= new Point(27000,12000);
driver.manage().window().setPosition(p);
Thread.sleep(2000);
//driver.quit();


	}
}
