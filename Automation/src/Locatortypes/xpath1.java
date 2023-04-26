//Flipcart login page by using xPath
package Locatortypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);//upcasting
		driver.manage().window().maximize();
	
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		
		//xpath by attribute-Syntax://tagname[@propertyname='property value']
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("Puja12@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("11223345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='submitLogin']")).click();
		Thread.sleep(1000);
		
		//xPath by Text()-Syntax://tagname[text()='text value']
		driver.findElement(By.xpath("//input[Text()='inputEmail')]")).sendKeys("puja2@gmail.com");
		Thread.sleep(1000);
		
		//xPath by contains-Syntax:- //tagname[contains(text(),'textName')]
		driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
		Thread.sleep(1000);
		
		//xPath by Index
		
		
}
}
