package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DDF_POM_TestNG_baseclass_Utilityclass.GithubSignout;

public class Github_signout {
	@FindBy(xpath="//button[contains(text(),'Sign out')]")private WebElement Signout;

	//2. Initialization
	public Github_signout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Usage
	public void clickGitHubHomePageSignOutBtn()
	{
		Signout.click();
	}

}
