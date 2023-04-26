package Locatortypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class qapune {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);//upcasting
		driver.manage().window().maximize();
	
		driver.get("https://www.qapune.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9527613811");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pari@a1b2");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Services']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='About Us']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Why Us']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Testimonials']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.className("preview overlay-scroll Poppins jd-webp web-theme-background")).click();
	    //driver.findElement(By.className("btn button btn button btn-sm btn-rounded  hoverStyle34462")).click();
	    //Thread.sleep(2000);
	   // driver.findElement(By.className("icon-search")).click();
	    //Thread.sleep(2000);
	    //driver.findElement(By.xpath("//span[text()='quantumacademypune@gmail.com']")).click();
	    //Thread.sleep(2000);
	    driver.findElement(By.className("whatsappIcon")).click();
	    Thread.sleep(4000);
	    driver.quit();
}
	
}