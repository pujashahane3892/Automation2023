package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quantum_homepage {
	@FindBy(xpath="//span[@class='icon-pagination-down login-signup-color']")private WebElement logOutBtn;
	 public quantum_homepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public void clickquantumHomePagelogOutBtn()
	 {
		 logOutBtn.click();
	 }

	 
}
