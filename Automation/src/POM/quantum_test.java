package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class quantum_test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);//upcasting
		driver.manage().window().maximize();
	
		driver.get("https://www.qapune.com/");
	Thread.sleep(2000);
	quantum_signin signin = new quantum_signin(driver);
	signin.clickquantumSigninBtn();
	Thread.sleep(2000);
	
	quantum_login login = new quantum_login(driver);
	login.setquantumLoginMob();
	login.setquantumLoginPW();
	login.clickquantumloginBtn();
	Thread.sleep(2000);
	
	quantum_homepage homepage = new quantum_homepage(driver);
	homepage.clickquantumHomePagelogOutBtn();
	Thread.sleep(2000);
	
	quantum_logout logout = new quantum_logout(driver);
	logout.clickquantumHomePagelogOutBtn();
	Thread.sleep(2000);
    driver.quit();

	}
	
}