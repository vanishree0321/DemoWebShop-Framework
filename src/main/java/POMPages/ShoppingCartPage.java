package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage 
{
	public ShoppingCartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="CountryId")
	private WebElement CountryDropdown;
	
	@FindBy(id="termsofservice")
	private WebElement TermsandCondition;
	
	public WebElement getCountryDropdown() {
		return CountryDropdown;
	}
		
	@FindBy(xpath="//h1[text()='Checkout']")
	private WebElement CheckoutPage; 
	
	public WebElement getCheckoutPage() {
		return CheckoutPage;
	}

	public WebElement getTermsandCondition() {
		return TermsandCondition;
	}

	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}

	@FindBy(id="checkout")
	private WebElement CheckoutButton;
}
	
	


