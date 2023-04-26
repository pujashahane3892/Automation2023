package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_login {
 @FindBy(xpath="//input[@id='login_field']")private WebElement UN;
 @FindBy(xpath="//input[@id='password']")private WebElement PW;
 @FindBy(css="input[type='submit']")private WebElement LoginBtn;
 
 //2.Initialization
 public  Github_login(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 //3.Usage
 public void setGithubLoginUN()
 {
	 UN.sendKeys("pujashahane3892@gmail.com");
 }
 public void setGithubLoginPW()
 {
	 PW.sendKeys("Pari@a1b2");
 }
 public void clickGithubLohinBtn()
 {
	 LoginBtn.click();
 }
}
