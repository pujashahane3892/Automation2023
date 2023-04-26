package Locatortypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class automobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);//upcasting
		driver.manage().window().maximize();
	
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.findElement(By.id("nav_automobile")).click();
		driver.findElement(By.id("make")).sendKeys("Audi");
		Thread.sleep(2000);
}
}