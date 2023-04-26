package DDF_POM_TestNG_baseclass_Utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GithubSignout {
	@FindBy(xpath="//button[contains(text(),' Sign out')]")private WebElement SignOutBtn;
	public GithubSignout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickGithubSignoutBtn()
	{
		SignOutBtn.click();
	}

}
