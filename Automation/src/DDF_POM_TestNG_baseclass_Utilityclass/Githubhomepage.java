package DDF_POM_TestNG_baseclass_Utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Githubhomepage {
	@FindBy(xpath="//summary[@class='Header-link'][2]")private WebElement logoutBtn;
@FindBy(xpath="//strong[contains(text(),'pujashahane3892')]")private WebElement username;
public Githubhomepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickGithubLogoutBtn() throws InterruptedException
{
	logoutBtn.click();
	Thread.sleep(4000);
}
//to get actual un from UI
public String verifyGithubhomepageUN()
{  String actResult = username.getText();
	return actResult;
	
}
}
