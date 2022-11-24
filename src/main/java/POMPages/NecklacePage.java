package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NecklacePage 
{
	public NecklacePage (WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(.,'130.00')]")
	private WebElement Price;
	
	public WebElement getPrice() {
		return Price;
	}
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	private WebElement Addtocart;

	public WebElement getAddtocart() {
		return Addtocart;
	}
	@FindBy(xpath="//input[@value='1']")
	private WebElement Qty;

	public WebElement getQty() {
		return Qty;
	}
	@FindBy(xpath="//p[text()='The product has been added to your ']")
	private WebElement PopupMsg;

	public WebElement getPopupMsg() {
		return PopupMsg;
	}
    @FindBy(xpath="//span[text()='Shopping cart']")
    private WebElement Shoppingcart;

	public WebElement getShoppingcart() {
		return Shoppingcart;
	}
	@FindBy(xpath="//h1[text()='Shopping cart']")
	private WebElement ShoppingCartPage;

	public WebElement getShoppingCartPage() {
		return ShoppingCartPage;
	}
		
	}


