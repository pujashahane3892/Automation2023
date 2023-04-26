package Locatortypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xPath {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);//upcasting
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//8. xpath by attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qa@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("12345678");
		Thread.sleep(1000);
		//xpath by text
		driver.findElement(By.xpath("//button[text()='login']")).click();
		Thread.sleep(1000);
		
		//xpath by contains
		driver.findElement(By.xpath("//button[contains(test(),'Log')]")).click();
		Thread.sleep(1000);
		
		//x path by Index
		driver.findElement(By.xpath("(//a[contains(text().'Create')])[1]")).click();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
