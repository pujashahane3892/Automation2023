package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_homepage {
 
		 @FindBy(xpath="(//summary[@class='Header-link'])[2]")private WebElement SignOutBtn;

		 //2.Initialization
		 public Github_homepage(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		 
		 //3.Usage
		 public void clickGithubHomePageSignOutBtn()
		 {
			 SignOutBtn.click();
		 }

	
}
