package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BasePage;
import POMPages.LoginPage;

public class LoginTest extends BasePage {
	@Test
	public void login()
	{
	LoginPage login=new LoginPage(driver);
	login.getLoginLink().click();
	Reporter.log("Login page is displayed");
	assertTrue(login.getLoginLink().isSelected(),"login page is not displayed");
	login.getEmailTextfield().sendKeys("vanishreegowda21@gmail.com");
	Reporter.log("Emailid is entered into EmailTextfield");
	
	login.getPasswordTextfield().sendKeys("Vani@7411");
	Reporter.log("Password is entered into PasswordTextfield");
	
	login.getRemembercheckbox().click();
	Reporter.log("Rememberme is checked into Rememberme checkbox");
	
	login.getLoginButton().click();
		
		
	}
	

}
