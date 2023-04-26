package DDF_POM_TestNG_baseclass_Utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class githublogin {
	@FindBy(xpath="//input[@id='login_field']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PW;
	@FindBy(css="input[type='submit']")private WebElement loginBtn;
	private WebElement logibBtn;
	public githublogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setGithubloginUN(String username)
	{
UN.sendKeys(username);
}
	public void setGithubloginPW(String password) {
		PW.sendKeys(password);
	}
	public void clickGithubLoginBtn()
	{
		logibBtn.click();
	}
}
