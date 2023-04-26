package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Github_test {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");	
	
		WebDriver driver = new ChromeDriver(option);//upcasting
		driver.manage().window().maximize();
		driver.navigate().to("https://github.com");
		Thread.sleep(2000);
		
		Github_signin signin = new Github_signin(driver);
		signin.clickGithubSignInBtn();
		Thread.sleep(2000);
		
		Github_login login = new Github_login(driver);
		login.setGithubLoginUN();
		login.setGithubLoginPW();
		login.clickGithubLohinBtn();
		Thread.sleep(2000);
		
		Github_homepage homepage = new Github_homepage(driver);
		homepage.clickGithubHomePageSignOutBtn();
		Thread.sleep(2000);
	
		
		Github_signout SignOut = new Github_signout(driver);
		SignOut.clickGitHubHomePageSignOutBtn();
		Thread.sleep(2000);
        driver.quit();
	
	}

}
