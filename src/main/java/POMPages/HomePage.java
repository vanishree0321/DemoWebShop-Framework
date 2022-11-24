package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[contains(.,'Jewelry')])[1]")
	private WebElement JewelryButton;
	
	public WebElement getJewelryButton() {
		return JewelryButton;
	}
	@FindBy(xpath="//strong[text()='Jewelry']")
	private WebElement JewelryPage;

	public WebElement getJewelryPage() {
		return JewelryPage;
	}
	
	

}
