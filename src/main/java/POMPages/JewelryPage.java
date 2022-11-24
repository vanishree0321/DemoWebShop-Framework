package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage 
{
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//option[text()='Position']")
	private WebElement PositionDropdown;
	
	public WebElement getPositionDropdown() {
		return PositionDropdown;
	}
	@FindBy(xpath="//option[text()='8']")
	private WebElement DisplayDropdown;
	
	@FindBy(xpath="//option[text()='Grid']")
	private WebElement ViewasDropdown;
	

	public WebElement getViewasDropdown() {
		return ViewasDropdown;
	}

	public WebElement getDisplayDropdown() {
		return DisplayDropdown;
	}


	public WebElement getBlackandwhiteDiamondHeartLink() {
		return BlackandwhiteDiamondHeartLink;
	}

	@FindBy(xpath="//a[text()='Black & White Diamond Heart']")
	private WebElement BlackandwhiteDiamondHeartLink;
	
	@FindBy(xpath="//strong[text()='Black & White Diamond Heart']")
	private WebElement BlackandWhiteDiamondheartPage;

	public WebElement getBlackandWhiteDiamondheartPage() {
		return BlackandWhiteDiamondheartPage;
	}
	@FindBy(xpath="//span[contains(.,'130.00')]")
	private WebElement Price;
	
	
	
	

}
