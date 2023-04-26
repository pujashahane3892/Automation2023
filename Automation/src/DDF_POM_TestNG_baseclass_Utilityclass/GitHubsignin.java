package DDF_POM_TestNG_baseclass_Utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubsignin {
	//1.Declaration
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")private WebElement SI;
	public GitHubsignin(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}
	public void clickGitHubsigninbtn()
	{
		SI.click();
	}

}
