package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quantum_logout {
	@FindBy(className="preview overlay-scroll Poppins jd-webp web-theme-background")private WebElement logOutBtn;
	public quantum_logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickquantumHomePagelogOutBtn()
	 {
		 logOutBtn.click();
}
}
