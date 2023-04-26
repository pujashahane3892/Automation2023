package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_signin {
	//1. Declaration
	@FindBy(xpath = "//a[contains(text(),'Sign in')]") private WebElement signIn;
	//->driver.findElement(By.xpath("//a[contains(text().'Sign in')]"));
	//2. Initialization
	public Github_signin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3. Usage
	public void clickGithubSignInBtn()
	{
		signIn.click();
	
	}
}
