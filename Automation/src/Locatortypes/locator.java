package Locatortypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);//upcasting
		driver.manage().window().maximize();
	
		driver.get("file:///E:/HTML/login.html");
		//1.TagName
		driver.findElement(By.tagName("input")).sendKeys("Pujashahane123@gmail.com");
		//Thread.sleep(1000);
		//2. id
		driver.findElement(By.id("12345")).sendKeys("12345678");
		//Thread.sleep(1000);
		//3. name
		driver.findElement(By.name("puja")).sendKeys("Puja123@gmail.com");
		Thread.sleep(1000);
        //4.className
		driver.findElement(By.className("class123")).sendKeys("26547896");
		
		//5.LinkText
		driver.findElement(By.linkText("Link1")).click();
		Thread.sleep(1000);
		//6.partialLinkText
		driver.findElement(By.partialLinkText("Li")).click();
	
		
	Thread.sleep(2000);
	driver.close();
	
	}
	

}
