package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import POMPages.RegisterPage;

public class RegisterTest extends BaseTest
{
	@Test
	public void Register()
	{
		RegisterPage register=new RegisterPage(driver);
		register.getRegisterLink().click();
		Reporter.log("Clicked on RegisterLink");
		
		register.getGenderRadiobutton().click();
		Reporter.log("Clicked on Female Gender Radio button");
		
		register.getFirstNameTextfield().sendKeys("Vanishree");
		Reporter.log("Entered Firstname in FirstName Textfield");
		
		register.getLastNameTextfield().sendKeys("M");
		Reporter.log("Entered LastName in LastName textfield");
		
		register.getEmailTextfield().sendKeys("vanigowdas54@gmail.com");
		Reporter.log("Entered Email in Email Textfield");
		
		register.getPasswordTextfield().sendKeys("Vani@7411");
		Reporter.log("Entered Password in Password Textfield");
		
		register.getConfirmPasswordTextField().sendKeys("Vani@7411");
		Reporter.log("Entered confirm password in confirm password textfield" );
		
		register.getRegisterButton().click();
		Reporter.log("Clicked on Register button");
		
	}

	}
