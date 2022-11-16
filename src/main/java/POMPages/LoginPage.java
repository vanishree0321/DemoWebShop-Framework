package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement LoginLink;
	
	public WebElement getLoginLink() {
		return LoginLink;
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
	@FindBy(id="RememberMe")
	private WebElement Remembercheckbox;

	public WebElement getRemembercheckbox() {
		return Remembercheckbox;
	}
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	

}
