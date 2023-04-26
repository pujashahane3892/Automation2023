package DDF_POM_TestNG_baseclass_Utilityclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass{
GitHubsignin signin;
githublogin login;
Githubhomepage home;
GithubSignout signout;

@BeforeClass
public void browseropen() throws InterruptedException, IOException
{
	openBrowser();
	signin = new GitHubsignin(driver);
	login = new githublogin(driver);
	home = new Githubhomepage(driver);
	signout = new GithubSignout(driver);
	
}
@BeforeMethod
public void login() throws EncryptedDocumentException, IOException, InterruptedException
{
	signin.clickGitHubsigninbtn();
	login.setGithubloginUN(UtilityClass.getTestData(0,0));
	login.setGithubloginPW(UtilityClass.getTestData(0,1));
	login.clickGithubLoginBtn();
	Thread.sleep(2000);
	home.clickGithubLogoutBtn();
}
@Test
public void test() throws EncryptedDocumentException, IOException
{
	String expResult = UtilityClass.getTestData(0, 2);
	String actResult = home.verifyGithubhomepageUN();
	
	Assert.assertEquals(actResult, expResult,"act and exp result is different");
}
@AfterMethod
public void logout()
{
	signout.clickGithubSignoutBtn();
}
@AfterClass
public void closebrowser()
{
	driver.quit();
}
}