package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Register']")
		private WebElement RegisterLink;
	
	public WebElement getRegisterLink() {
		return RegisterLink;
	}
	
	@FindBy(id="gender-female")
	private WebElement GenderRadiobutton;

	public WebElement getGenderRadiobutton() {
		return GenderRadiobutton;
	}
	
	@FindBy(id="FirstName")
	private WebElement FirstNameTextfield;

	public WebElement getFirstNameTextfield() {
		return FirstNameTextfield;
	}
	
	@FindBy(id="LastName")
	private WebElement LastNameTextfield;

	public WebElement getLastNameTextfield() {
		return LastNameTextfield;
	}
	
	@FindBy(id="Email")
	private WebElement EmailTextfield;

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}
	@FindBy(id="Password")
	private WebElement PasswordTextfield;

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}
	@FindBy(id="register-button")
	private WebElement RegisterButton;

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
	
	}
	


