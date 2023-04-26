package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quantum_signin {
	@FindBy(xpath="//span[text()='Log In']") private WebElement signIn;
	public quantum_signin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickquantumSigninBtn()
	{
		signIn.click();
	
	}
}


