package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//expected URL
		String expUrl = "https://www.google.com/search?q=www.w3schools.com+sql&rlz=1C1YTUH_enIN1007IN1007&oq=www&aqs=chrome.2.69i60j69i57j35i39j69i60l5.11121j0j4&sourceid=chrome&ie=UTF-8";
		String expTitle = "www.w3schools.com sql - Google Search";
		//sets the configuration of browsers
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(option);//upcasting
	//4. maximize() - to maximize the browser
	driver.manage().window().maximize();
//1. get() - to open url
	driver.get("https://www.google.com/search?q=www.w3schools.com+sql&rlz=1C1YTUH_enIN1007IN1007&oq=www&aqs=chrome.2.69i60j69i57j35i39j69i60l5.11121j0j4&sourceid=chrome&ie=UTF-8");
	//5.minimize() - to minimize browser
	//driver.manage().window().minimize();
	//6. get current URL
 String actUrl = driver.getCurrentUrl();
 System.out.println(actUrl);//https://www.google.com/search?q=www.w3schools.com+sql&rlz=1C1YTUH_enIN1007IN1007&oq=www&aqs=chrome.2.69i60j69i57j35i39j69i60l5.11121j0j4&sourceid=chrome&ie=UTF-8
if(actUrl.equals(expUrl)) {
	System.out.println("Pass");
}
	else
	{
		System.out.println("fail");
	}
//7. getTitle() = used to get title name
String actTitle = driver.getTitle();
System.out.println(actTitle);//www.w3schools.com sql - Google Search
if(actTitle.equals(expTitle)) {
	System.out.println("Pass");
}else
{
	System.out.println("fail");
}
Thread.sleep(1000);

}
 //Thread.sleep(20000);//to delay browser closing
	//2. close() - to close url
	//driver.close();
	//3. quit() - to close all windows
	//driver.close();
	
	}


