package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quantum_login {
	@FindBy(xpath="//input[@name='mobile']")private WebElement Mob;
	@FindBy(xpath="//input[@name='password']")private WebElement PW;
	@FindBy(css="button[type='submit']")private WebElement loginBtn;
	 public quantum_login(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public void setquantumLoginMob()
	 {
		 Mob.sendKeys("9527613811");
	 }
	 public void setquantumLoginPW()
	 {
		 PW.sendKeys("Pari@a1b2");
	 }
	 public void clickquantumloginBtn()
	 {
		 loginBtn.click();
	 }
}
