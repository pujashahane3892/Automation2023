//flipcart Login page by using cssSelector
package Locatortypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelector1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);//upcasting
		driver.manage().window().maximize();
	
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("puja123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("1223345");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[value='SIGN IN']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("home")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("commissions")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("sb-affiliate-tools sblink")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("faqs")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("api")).click();
		Thread.sleep(1000);
		driver.close();
	}
}
