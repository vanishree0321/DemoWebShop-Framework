package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import POMPages.RegisterPage;

public class RegisterTest extends BaseTest {
	@Test
	public void Register() throws InterruptedException {
		RegisterPage register = new RegisterPage(driver);

		// RegisterLink
		register.getRegisterLink().click();
		Reporter.log("Register page is displayed");
		// assertTrue(register.getRegisterLink().isSelected(),"Register page is not
		// displayed");

		// GenderRadiobutton
		register.getGenderRadiobutton().click();
		Reporter.log("Female Gender is selected");

		// FirstNameTextfield
		register.getFirstNameTextfield().sendKeys("vani");
		Reporter.log("FirstName is entered into FirstNameTextfield");

		// LastNameTextfield
		register.getLastNameTextfield().sendKeys("M");
		Reporter.log("LastName is entered into LastNameTextfield");

		// EmailTextfield
		register.getEmailTextfield().sendKeys("vanishree21@gmail.com");
		Reporter.log("Email is entered into EmailTextfield");

		// PasswordTextfield
		register.getPasswordTextfield().sendKeys("Vani@7411");
		Reporter.log("Password is entered into PasswordTextfield");

		// ConfirmPasswordTextfield
		register.getConfirmPasswordTextField().sendKeys("Vani@7411");
		Reporter.log("Confirmpassword is entered into confirmpasswordTextfield");
		Thread.sleep(2000);
		register.getRegisterButton().click();

	}
}
